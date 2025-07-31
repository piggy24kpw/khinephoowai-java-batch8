import java.util.Scanner;

public class StudentAvg_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ans;
        do {
            System.out.println("Enter the number of students: ");
            int total_student = input.nextInt();

            for (int i = 1; i <= total_student; i++) {
                double total = 0;
                System.out.println("Enter 3 grades for student " + i + ":");
                for (int j = 1; j <= 3; j++) {
                    System.out.print("Grade " + j + ": ");
                    double grade = input.nextDouble();
                    total += grade;
                }

                double avg = total / 3;
                System.out.println("Average for student " + i + " is: " + avg);
            }
            input.nextLine();
            System.out.println("Do you want to continue?(Yes/No)");
            ans = input.nextLine();
        } while (ans.equalsIgnoreCase("Yes"));
        input.close();

    }
}