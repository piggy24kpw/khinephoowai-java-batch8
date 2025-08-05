package Day6Homework;

import java.util.Scanner;

public class ParsingDivision {
    public static int parseAndDivide(String a, String b) {
        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            return num1 / num2;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number. Please enter number.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Divide Numbers");

        System.out.println("Enter first number:");
        String n1 = input.nextLine();

        System.out.println("Enter second number");
        String n2 = input.nextLine();

        System.out.println(parseAndDivide(n1,n2));
    }
}
