package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckingAccount_start {
    public static void main(String[] args) {

        List<Integer> transactions = new ArrayList<>();

        CheckingAccount c1 = new CheckingAccount(10000, "John Doe", 112390);

        int choice = 0;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Welcome to your Checking account:\n1) Deposit;\n2) Withdraw;\n3) Show current balance;\n4) Show last 5 transactions; \n5) Account Info;\n0) Exit");
            choice = in.nextInt();
            in.nextLine();
            if (choice == 1) {
                System.out.println("Please insert the amount you would like to deposit");
                int amount = in.nextInt();
                c1.deposit(amount);
                transactions.add(amount);
                System.out.println("Deposit successful!");
                System.out.println("----------------------------");
            } else if (choice == 2) {
                System.out.println("Please insert the amount you would like to withdraw");
                int amount = in.nextInt();
                c1.withdraw(amount);
                transactions.add(Math.negateExact(amount));
                System.out.println("Withdrawal successful!");
                System.out.println("----------------------------");
            } else if (choice == 3) {
                System.out.println("Your current balance: " + c1.getInitialBalance());
                System.out.println("----------------------------");
            } else if (choice == 4) {
                System.out.println("Last 5 transactions: ");
                if (transactions.size() >= 5) {
                    List<Integer> lastFive = transactions.subList(transactions.size() - 5, transactions.size());
                    for (int i = 0; i < lastFive.size(); i++) {
                        System.out.println((i + 1) + ") " + lastFive.get(i));
                    }
                } else {
                    for (int i = 0; i < transactions.size(); i++) {
                        System.out.println((i + 1) + ") " + transactions.get(i));
                    }
                }

                System.out.println("----------------------------");
            } else if (choice == 5) {
                System.out.println("Account owner: " + c1.getOwner());
                System.out.println("Account number: " + c1.getAccountNumber());
                System.out.println("----------------------------");
            } else if (choice == 0) {
                System.out.println("----------------------------");
                System.out.println("Logout successful");
            }
        } while (choice != 0);

    }
}
