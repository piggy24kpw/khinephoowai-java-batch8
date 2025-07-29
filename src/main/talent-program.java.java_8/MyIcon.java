import java.util.Scanner;

public class MyIcon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Symbol:");
        String symbol = input.next();

        System.out.println("Enter Number ");
        int num = input.nextInt();

        input.close();

        for (int i = 0; i < num; i++) {
            System.out.print(symbol);
        }
        input.close();
    }
}
