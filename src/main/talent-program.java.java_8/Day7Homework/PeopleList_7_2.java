package Day7Homework;

import java.util.LinkedList;

public class PeopleList_7_2 {
    public static void main(String[] args) {
        LinkedList<String> people = new LinkedList<String>();
        people.add("Aye Aye");
        people.add("Nu Nu");
        people.add("John");
        people.add("Emily");
        people.add("Alice");

        System.out.println(people);

        people.removeFirst();

        people.addLast("James");

        System.out.println(people);

        System.out.println("The number of people is " + people.size());
    }
}
