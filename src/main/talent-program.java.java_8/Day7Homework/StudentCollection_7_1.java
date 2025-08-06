package Day7Homework;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;

    //create constructor
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}
public class StudentCollection_7_1 {
    public static void main(String[] args) {
        int result;

        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Myo Myo"));
        studentList.add(new Student(2, "Khin Khin"));
        studentList.add(new Student(3, "Kyaw Kyaw"));
        studentList.add(new Student(4, "Min Min"));
        studentList.add(new Student(5, "Su Su"));

        System.out.println("Student Lists:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        System.out.println("Enter student name to search");
        String nameSearch = input.nextLine();
        boolean match = false;

        for (Student n : studentList) {
            if (n.name.toLowerCase().contains(nameSearch.toLowerCase())) {
                System.out.println("Student " + n + " is found");
                match = true;
            }
        }

        if (!match) {
            System.out.println("No student found with " + nameSearch);
        } else {
            System.out.println("Search complete.");
        }

        //remove a student
        System.out.println("Enter student id to remove:");
        int studentID = input.nextInt();

        boolean removedID = true;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).id == studentID) {
                studentList.remove(i);
                removedID = true;
                System.out.println("Student with ID " + studentID + " removed.");
                break;
            }
        }
        if (!removedID) {
            System.out.println("ID does not exist.");
        }


        System.out.println("Total number of student is: " + studentList.size());
        input.close();
    }
}

