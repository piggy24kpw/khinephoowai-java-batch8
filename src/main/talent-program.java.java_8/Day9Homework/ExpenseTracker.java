package Day9Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Transaction {

    public enum Type {
        expense,
        income
    }

    public enum Category {
        SALARY,
        TIP,
        SNACK,
        PH_BILL,
        TRAN_BILL,
        MEAL_BILL,
        PRESENT,
        SHOPPING,
        DONATION
    }

    private Type currentType;
    private Category currentCategory;
    private double amount;
    private String date; // stored as dd/MM/yyyy

    public Transaction(Type currentType, Category currentCategory, double amount, String date) {
        this.currentType = currentType;
        this.currentCategory = currentCategory;
        this.amount = amount;
        this.date = date;
    }

    public Type getCurrentType() {
        return currentType;
    }

    public Category getCurrentCategory() {
        return currentCategory;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Type: " + currentType +
                ", Category: " + currentCategory +
                ", Amount: $" + amount +
                ", Date: " + date;
    }
}

public class ExpenseTracker {

    static List<Transaction> transactionList = new ArrayList<>();
    static double balance;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        balance = input.nextDouble();
        input.nextLine(); // consume newline

        int menu;
        do {
            System.out.println("\n=== Finance Tracker ===");
            System.out.println("Current Balance: $" + balance);
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. View All Transactions");
            System.out.println("4. View Total expense by Category");
            System.out.println("5. View expense and income Monthly Summary");
            System.out.println("6. Remove Transaction");
            System.out.println("0. Exit and Save");
            System.out.print("Choose option: ");
            menu = input.nextInt();
            input.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    addExpense(input);
                    break;
                case 2:
                    addIncome(input);
                    break;
                case 3:
                    printTransactions();
                    break;
                case 4:
                    printTotalExpenseByCategory(input);
                    break;
                case 5:
                    viewByMonth(input);
                    break;
                case 6:
                    removeTransaction(input);
                    break;
                case 0:
                    saveData(transactionList);
                    System.out.println("Data saved. Exiting...");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        } while (menu != 0);

        input.close();
    }

    public static void addExpense(Scanner input) {
        System.out.print("Enter Category (SNACK, PH_BILL, TRAN_BILL, MEAL_BILL, PRESENT, SHOPPING, DONATION): ");
        String catInput = input.nextLine().toUpperCase();
        Transaction.Category category;
        try {
            category = Transaction.Category.valueOf(catInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid category.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Date (dd/MM/yyyy): ");
        String date = input.nextLine();

        if (!isValidDate(date, "dd/MM/yyyy")) {
            System.out.println("Invalid date format.");
            return;
        }

        transactionList.add(new Transaction(Transaction.Type.expense, category, amount, date));
        balance -= amount;
        System.out.println("Expense added.");
    }

    public static void addIncome(Scanner input) {
        System.out.print("Enter Category (SALARY, TIP): ");
        String catInput = input.nextLine().toUpperCase();
        Transaction.Category category;
        try {
            category = Transaction.Category.valueOf(catInput);
            if (!(category == Transaction.Category.SALARY || category == Transaction.Category.TIP)) {
                System.out.println("Income category must be SALARY or TIP.");
                return;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid category.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Date (dd/MM/yyyy): ");
        String date = input.nextLine();

        if (!isValidDate(date, "dd/MM/yyyy")) {
            System.out.println("Invalid date format.");
            return;
        }

        transactionList.add(new Transaction(Transaction.Type.income, category, amount, date));
        balance += amount;
        System.out.println("Income added.");
    }

    public static void printTransactions() {
        if (transactionList.isEmpty()) {
            System.out.println("No transactions to show.");
            return;
        }
        int i = 1;
        for (Transaction t : transactionList) {
            System.out.println(i++ + ". " + t);
        }
    }

    public static void printTotalExpenseByCategory(Scanner input) {
        System.out.print("Enter category to calculate total expense: ");
        String catInput = input.nextLine().toUpperCase();
        Transaction.Category category;
        try {
            category = Transaction.Category.valueOf(catInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid category.");
            return;
        }

        double total = 0;
        for (Transaction t : transactionList) {
            if (t.getCurrentType() == Transaction.Type.expense && t.getCurrentCategory() == category) {
                total += t.getAmount();
            }
        }
        System.out.printf("Total expenses for category %s: $%.2f%n", category, total);
    }

    public static void viewByMonth(Scanner input) {
        System.out.print("Enter month and year (MM/yyyy): ");
        String monthYear = input.nextLine();

        if (!isValidDate("01/" + monthYear, "dd/MM/yyyy")) {
            System.out.println("Invalid month/year format.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM/yyyy");

        System.out.println("Transactions for " + monthYear + ":");

        boolean found = false;
        for (Transaction t : transactionList) {
            try {
                Date date = sdf.parse(t.getDate());
                String formattedMonth = monthFormat.format(date);
                if (formattedMonth.equals(monthYear)) {
                    System.out.println(t);
                    found = true;
                }
            } catch (ParseException e) {
                System.out.println("Skipping transaction with invalid date: " + t.getDate());
            }
        }
        if (!found) {
            System.out.println("No transactions found for this month.");
        }
    }

    public static void removeTransaction(Scanner input) {
        if (transactionList.isEmpty()) {
            System.out.println("No transactions to remove.");
            return;
        }
        printTransactions();
        System.out.print("Enter transaction number to remove: ");
        int index = input.nextInt();
        input.nextLine();

        if (index >= 1 && index <= transactionList.size()) {
            Transaction removed = transactionList.remove(index - 1);
            if (removed.getCurrentType() == Transaction.Type.expense) {
                balance += removed.getAmount();
            } else {
                balance -= removed.getAmount();
            }
            System.out.println("Transaction removed.");
        } else {
            System.out.println("Invalid transaction number.");
        }
    }

    public static void saveData(List<Transaction> transactionList) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("pettycash.txt"))) {
            for (Transaction t : transactionList) {
                // Format: type,category,amount,date
                pw.printf("%s,%s,%.2f,%s%n",
                        t.getCurrentType(),
                        t.getCurrentCategory(),
                        t.getAmount(),
                        t.getDate());
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private static boolean isValidDate(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
