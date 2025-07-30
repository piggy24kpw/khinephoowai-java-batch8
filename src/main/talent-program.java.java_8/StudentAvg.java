import java.util.Scanner;

public class StudentAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        String ans;
        do {
            System.out.println("Enter the number of students: ");
            int total_student = input.nextInt();

            for (int i = 1; i <= total_student; i++) {

                System.out.println("Enter 3 grades for student " + i + ":");
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Student " + j + ": ");
                    double grade = input.nextDouble();
                    total += grade;
                }
                double avg = total / 3;
                System.out.println("Average for student " + i + " is: " + avg);
            }
            System.out.println("Do you want to continue");
            ans = input.nextLine();
        } while (ans == "Yes");


    }
}
