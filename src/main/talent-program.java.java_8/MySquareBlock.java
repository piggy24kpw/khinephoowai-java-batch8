import java.util.Scanner;

public class MySquareBlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character");
        char ch = input.next().charAt(0);

        System.out.print("How many lines to print");
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        input.close();
    }
}
