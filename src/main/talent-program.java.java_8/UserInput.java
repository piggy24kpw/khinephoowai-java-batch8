import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter name:");
        String name=input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.close();

    }
}
