import java.util.Scanner;

public class Calculator_3_3 {
    public static int Multiply(int a, int b) {
        return a * b;
    }
    public static int Multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        String ans;

        Scanner input = new Scanner(System.in);

            System.out.println("Enter first number you want to multiply");
            num1 = input.nextInt();
            System.out.println("Enter second number you want to multiply");
            num2 = input.nextInt();
            System.out.println(Multiply(num1, num2));

            input.nextLine();
            System.out.println("Do you want to continue (Yes/No)!");
            ans = input.nextLine();
            if (ans.equalsIgnoreCase("Yes"))
            {
                System.out.println("Enter third number you want to multiply");
                num3 = input.nextInt();
                System.out.println(Multiply(num1, num2, num3));
            }
            else {
                System.out.println("End!");
            }


    }
}
