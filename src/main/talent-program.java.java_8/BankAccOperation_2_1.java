import java.util.Scanner;

public class BankAccOperation_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your initial balance:");
        int balance = input.nextInt();
        int amount;
        int menu;

        do {
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = input.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Your balance is: " + balance);
                    } else {
                        System.out.println("Insufficient balance. Try Again.");
                    }
                    break;

                case 3:
                    System.out.println("Your remaining balance is: " + balance);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (menu != 4);

        input.close();
    }
}
