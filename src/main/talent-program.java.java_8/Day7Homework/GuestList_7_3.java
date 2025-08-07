package Day7Homework;

import java.util.HashSet;
import java.util.Scanner;

public class GuestList_7_3 {
    public static void main(String[] args) {
        HashSet<String> guest = new HashSet<String>();
        guest.add("Smith");
        guest.add("Hana");
        guest.add("John");
        guest.add("Smith");
        guest.add("James");
        guest.add("Jue");

        System.out.println(guest);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter to find name:");
        String name = input.nextLine();
        if (guest.contains(name)) {
            System.out.println(name + " is on the guest list.");
        } else {
            System.out.println(name + " is not on the guest list.");
        }

        guest.remove("Jue");
        System.out.println("The total number of guest is " + guest.size());

    }
}
