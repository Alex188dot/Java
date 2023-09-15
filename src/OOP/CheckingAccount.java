package OOP;

public class CheckingAccount {
    /* Create a checking account that can make a transfer, withdraw, deposit and print the
    current balance + the last 5 transactions
     */

    private int initialBalance;
    private String owner;
    private int accountNumber;


    public CheckingAccount (int initialBalance, String owner, int accountNumber) {
        this.initialBalance = initialBalance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return ("Account holder: " + owner + " - Current balance: " + initialBalance + " - Account Num: " + accountNumber);
    }

    public int deposit(int amount) {
        this.initialBalance += amount;
        return initialBalance;
    }

    public int withdraw (int amount) {
        if (amount <= initialBalance) {
            this.initialBalance -= amount;
            return initialBalance;
        } else return 0;
    }




}
