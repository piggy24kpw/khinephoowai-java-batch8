import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MyAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Birthday Year:");
        int birth_year = input.nextInt();

        LocalDate currDate = LocalDate.now();
        System.out.println(currDate);

        LocalDate birthDate = LocalDate.of(birth_year, 10, 28);
        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Your age is" + age);

        input.close();
    }

}
