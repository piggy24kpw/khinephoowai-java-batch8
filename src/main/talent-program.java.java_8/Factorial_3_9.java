import java.util.Scanner;

public class Factorial_3_9 {
    public static int FactorialNum(int n){
        int result = 1;
        for (int i = n; i >= 1; i--){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = FactorialNum(num);
        System.out.println("The factorial number of "+num+" is "+ fact);

        input.close();
    }
}
