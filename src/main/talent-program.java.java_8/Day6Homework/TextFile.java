package Day6Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

    public void createFile() {
        try {
            File myObj = new File("khinephoowai\\Java\\testJava2.txt");
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

        int menu;

       do {
           System.out.println("1: Create File");
           System.out.println("2: Write File");
           System.out.println("3: Delete File");
           System.out.print("Enter your choice: ");
            menu = input.nextInt();

           switch (menu) {
               case 1:
                   txt.createFile();
                   break;
               case 2:
                   System.out.print("Enter content: ");
                   String writePath = input.nextLine();
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
       }while(menu != 3);
      input.close();
    }
}
