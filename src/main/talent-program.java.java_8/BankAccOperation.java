import java.util.Scanner;

public class BankAccOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your initial balance:");
        int balance = input.nextInt();
        int amount;

        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int menu = input.nextInt();
        switch (menu){
            case 1:{
                System.out.println("Enter your add money");
                amount = input.nextInt();
                balance += amount;
                System.out.println("Your balance is"+balance);
                break;
            }
            case 2:{
                System.out.println("Enter your withdraw money");
                amount = input.nextInt();
                if(amount<=balance) {
                    balance -= amount;
                    System.out.println("Your balance is" + balance);
                }else{
                    System.out.println("Insufficient balance.Try Again");
                }
                break;

            }
            case 3:{
                System.out.println("Your remaining balance is"+balance);
                break;
            }
            case 4:{
                break;
            }

        }
    }
}
