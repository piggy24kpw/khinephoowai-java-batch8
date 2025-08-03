class Person {
    String name;
    int age;

    // create Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void introduce() {
        System.out.println("My name is " + name + " and I'm " + age + " years.");
    }

    public void getRole() {
        System.out.println("My name is  " + name + " and I'm a man");
    }
}

// Subclass: Student
class Student extends Person {
    int gradeLevel;

    // create constructor
    public Student(String name, int age, int gradeLevel) {
        super(name, age); // Call the Person constructor
        this.gradeLevel = gradeLevel;
    }

    public void introduce() {
        System.out.println("I'm " + name + " and attend in grade " + gradeLevel + ". I'm " + age + " years old.");
    }

    public void getRole() {
        System.out.println("My name is  " + name + " and I'm a student.");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    // create constructor
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the Person constructor
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("I'm " + name + ".I'm a teacher of " + subject + ", and I'm " + age + " years.");
    }

    public void getRole() {
        System.out.println("My name is  " + name + " and I'm a teacher.");
    }
}

public class Person_4_1 {
   static class Main {

        public static void main(String[] args) {
            Person person = new Person("Rosey", 32);
            Student student = new Student("Cherry", 21, 10);
            Teacher teacher = new Teacher("James", 35, "English");

            person.introduce();
            student.introduce();
            teacher.introduce();

            //create array of Person
            Person[] myPerson = new Person[3];
            myPerson[0] = new Student("Myo Myo", 25, 10);
            myPerson[1] = new Student("Bee",16,8);
            myPerson[2] = new Teacher("Tr.Grace",35,"Physics");

            System.out.println("Role of each person:");
            for(Person p : myPerson) {
                p.getRole();
            }
        }
    }
}


