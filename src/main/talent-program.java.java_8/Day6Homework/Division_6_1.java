package Day6Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Division_6_1 {
    public static int divide(int a, int b) {
        try {
              return a / b;
        } catch (Exception e) {
        System.out.println("Cannot divide by zero");

        }
        return -1;
    }


    public static void main(String[] args) {
        File myFile = new File("grades.txt");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student score: ");
        String score = input.nextLine();

        //File write
        try {
            // true = append mode
            FileWriter writer = new FileWriter("grades.txt", true);
            writer.write(name + "," + score + "\n");
            writer.close();

            System.out.println("Successfully added to the file");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to file.");
        }

        //File Read
        try{
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                String[] content = line.split(",");

                if (content.length == 2) {
                     name = content[0];
                     score = content[1];
                    System.out.println(name + " , " + score);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        System.out.println("Enter first number you want to divide:");
        int num1 = input.nextInt();
        System.out.println("Enter second number you want to divide:");
        int num2 = input.nextInt();
        System.out.println(divide(num1,num2));

    }
}
