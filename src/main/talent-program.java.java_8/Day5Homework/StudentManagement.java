package Day5Homework;
abstract class Person{
    String name;
    int id;

    public abstract void showDetails();
}

class Student extends Person{
    private int age;
    private String grade;

    public Student(String name, int id, int age, String grade){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    public void printDetails(){
        System.out.println("Student Name: " + name +"\nStudent ID: " + id + "\nStudent age: " + age + "\nStudent Grade: " + grade);

    }
    public void study(){
        System.out.println("Student is studying.");
    }
    public void study(String subject){
        System.out.println(name + " is studying " + subject);
    }

    @Override
    public void showDetails() {
        printDetails();
    }
}

class Teacher extends Person{
    String subject;
    public Teacher(String name, int id, String subject){
        this.name = name;
        this.id = id;
        this.subject = subject;
    }
    public void printTeacherDetails(){
        System.out.println(name + " is teaching " + subject + ".");
    }

    @Override
    public void showDetails() {
        printTeacherDetails();
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Student s = new Student("Hellen",5,21, "A");
        Teacher t = new Teacher("Mary" , 9 , "Maths");

        s.study();
        s.study("English");
        s.showDetails();

        t.showDetails();





    }
}
