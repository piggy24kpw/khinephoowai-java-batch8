class Employee{
    String name;
    int id;

    //create constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    double calculatePay(){
        return 0.0;
    }

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
    double calculatePay(){
        double payAmount;
        if(hoursWorked >= 160.00) {
            payAmount = (hourlyRate * 160) + ((hoursWorked - 160) * (hourlyRate + (hourlyRate * 1.5)));
            return payAmount;
        } else {
            payAmount = hourlyRate * hoursWorked;
            return payAmount;
        }
        /*String toString() {
            return Double.parseDouble("HourlyEmployee:" +
                    "\nSalary=" + payAmount);
        }*/

    }

}

class SalariedEmployee extends Employee{
    double annualSalary;

    public  SalariedEmployee(String name, int id, double annualSalary){
        super(name, id);
        this.annualSalary = annualSalary;
    }
    double calculatePay(){
        double salary = annualSalary / 12;
        return salary;
    }
    public String toString() {
        return "SalariedEmployee:" +
                "\nannualSalary=" + annualSalary;
    }
}
public class Employee_4_4 {
    static class Payroll{
        public static void main(String[] args) {
            Employee[] employeeList = new Employee[3];
            employeeList[0] = new HourlyEmployee("Mg Mg",5,10.5,8);
            employeeList[1] = new SalariedEmployee("Su Su",25,100);

            for(Employee e :employeeList){
                e.calculatePay();
                e.toString();
            }
        }
    }
}
