package Day6Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

    public void createFile() {
        try {
            File myObj = new File("khinephoowai/Java/testJava.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public void writeFile(String fileLocation, String content) {
        try {
            FileWriter myWriter = new FileWriter(fileLocation);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public void deleteFile(String fileLocation) {
        File myObj = new File(fileLocation);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) {
        TextFile txt = new TextFile();
        Scanner input = new Scanner(System.in);

        System.out.println("1: Create File");
        System.out.println("2: Write File");
        System.out.println("3: Delete File");
        System.out.print("Enter your choice: ");
        int menu = input.nextInt();
        input.nextLine(); // Consume the newline

        switch (menu) {
            case 1:
                txt.createFile();
                break;
            case 2:
                System.out.print("Enter file path to write: ");
                String writePath = input.nextLine();
                System.out.print("Enter content: ");
                String content = input.nextLine();
                txt.writeFile(writePath, content);
                break;
            case 3:
                System.out.print("Enter file path to delete: ");
                String deletePath = input.nextLine();
                txt.deleteFile(deletePath);
                break;
            default:
                System.out.println("Invalid option.");
        }

        input.close();
    }
}
