import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Weight in kilogram:");
        double weight = input.nextDouble();

        System.out.print("Enter Your Height in meters");
        double height = input.nextDouble();

        double bmi = weight/(height*height);
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
