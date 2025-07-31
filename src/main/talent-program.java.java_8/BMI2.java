import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Weight in lb:");
        double weight = input.nextDouble();

        System.out.print("Enter Your Height in feet");
        double height = input.nextDouble();

        System.out.print("Enter Your Height in inches");
        double height_inches =input.nextDouble();

        double bmi = (weight/(height_inches*height_inches))*703;
        System.out.println("Your BMI value is"+bmi);

        if (bmi<18.5){
            System.out.println("Under Weight");
        } else if (bmi<=18.5 | bmi<25) {
            System.out.println("Normal Weight");

        }else if (bmi<=25 | bmi<30){
            System.out.println("Overweight");
        }else if (bmi>=30){
            System.out.println("Obese");
        }else {
            System.out.println("None");
        }

    }
}
