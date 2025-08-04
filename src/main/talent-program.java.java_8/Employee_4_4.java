abstract class Employee{
    String name;
    int id;

    //create constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract double calculatePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }

}

//Subclass
class HourlyEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;

    public HourlyEmployee(String name, int id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public double calculatePay() {
        double payAmount;
        if (hoursWorked <= 40) {
            payAmount = hourlyRate * hoursWorked;
        } else {
            double overtime = hoursWorked - 40;
            payAmount = (hourlyRate * 40) + (overtime * hourlyRate);
        }
        return payAmount;
    }
        public String toString() {
            return "HoursEmployee Name:" + name + " \nID " + id + "\nPay Amount:" + calculatePay();
        }

}

class SalariedEmployee extends Employee{
    double annualSalary;

    public  SalariedEmployee(String name, int id, double annualSalary){
        super(name, id);
        this.annualSalary = annualSalary;
    }
    public double calculatePay(){
        double salary = annualSalary / 12;
        return salary;
    }
    public String toString() {
        return "SalariedEmployee Name:" + name + "\nID" + id + "\nannualSalary:" + annualSalary;
    }
}
public class Employee_4_4 {
    static class Payroll{
        public static void main(String[] args) {
            Employee[] employeeList = new Employee[3];
            employeeList[0] = new HourlyEmployee("Mg Mg",5,10.5,8);
            employeeList[1] = new SalariedEmployee("Su Su",25,100);
            employeeList[2] = new HourlyEmployee("Phoo Phoo",10,10.5,42);

            for(Employee e :employeeList){
                e.calculatePay();
                System.out.println(e);
            }
        }
    }
}
