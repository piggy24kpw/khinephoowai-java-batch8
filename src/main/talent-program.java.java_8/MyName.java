import java.util.Scanner;

public class MyName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        input.close();
    }
}
