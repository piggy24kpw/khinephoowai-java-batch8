package Day7Homework;

import java.util.*;

public class DepartmentManagement_7_5 {
    public static void main(String[] args) {
        List<String> studentName = new ArrayList<>();

        studentName.add("Emily");
        studentName.add("Grace");
        studentName.add("Alice");
        studentName.add("James");

        Map<String, Set<String>> subject = new HashMap<>();

        Set<String> emilySubject = new HashSet<>();
        emilySubject.add("C#");
        emilySubject.add("Java");
        emilySubject.add("Python");
        subject.put("Emily", emilySubject);

        Set<String> graceSubject = new HashSet<>();
        graceSubject.add("C++");
        graceSubject.add("OOP");
        graceSubject.add("PHP");
        subject.put("Grace", graceSubject);

        Set<String> aliceSubject = new HashSet<>();
        aliceSubject.add("Laravel");
        aliceSubject.add("React");
        aliceSubject.add("Python");
        subject.put("Alice", aliceSubject);

        Set<String> jamesSubject = new HashSet<>();
        jamesSubject.add("HTML");
        jamesSubject.add("CSS");
        jamesSubject.add("JS");
        subject.put("James", emilySubject);

        System.out.println("Student subjects:");
        for (String student : studentName) {
            Set<String> subjects = subject.get(student);
            System.out.println(student + " is attending in " + subjects);
        }

        subject.get("Emily").add("Networking");
        System.out.println("\nAdded new subject to Emily.");

        subject.get("Alice").remove("Python");
        System.out.println("Removed one subject from Alice.");

        Set<String> allSubjects = new HashSet<>();
        for (Set<String> subjects : subject.values()) {
            allSubjects.addAll(subjects);
        }

        System.out.println("All unique subjects in the department:");
        System.out.println(allSubjects);

    }
}
