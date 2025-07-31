import java.util.Scanner;

public class MarkGrade_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marks of  5 subjects");

        float sum = 0;

        for (int i = 1; i <= 5; i++) {

            double   marks = input.nextDouble();
                sum += marks;
            }
        float avg = sum / 5;
        System.out.println("Average mark is:"+avg);

        if (avg<60) {
            System.out.println("Your result is Grade F");
        }else if(avg<=69) {
            System.out.println("Your result is Grade D");
        } else if (avg<=79) {
            System.out.println("Your result is Grade C");
        }else if ( avg<=89) {
            System.out.println("Your result is Grade B");
        }else if (avg <= 100){
            System.out.println("Your result is Grade A");

    }
    }
}
