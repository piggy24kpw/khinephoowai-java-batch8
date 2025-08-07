package Day8Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Printer <T>{
    ArrayList<T> items;

    public Printer(){
        items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);

    }

   public void printAll(){
       for (T item : items) {
           System.out.print(item + " ");
       }
       System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Printer<Integer> printerInt = new Printer<>();
        Printer<Double> printerDouble = new Printer<>();

        System.out.println("Enter integers to print and type (y) to end input:");
        while (true) {
            System.out.print("Enter integer: ");
            String value = input.next();
            if (value.equalsIgnoreCase("y")) {
                break;
            }
            try {
                int number = Integer.parseInt(value);
                printerInt.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }

        System.out.print("All integer numbers: " );
        printerInt.printAll();

        System.out.println("Enter double to print and type (y) to end input:");
       while (true) {
            System.out.print("Enter double: ");
            String value = input.next();
            if (value.equalsIgnoreCase("y")) {
                break;

            }
            try {
                double numDouble = Double.parseDouble(value);
                printerDouble.add(numDouble);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter only decimal numbers.");
            }
        }


        System.out.print("All double numbers:  ");
        printerDouble.printAll();

        input.close();
    }
}
