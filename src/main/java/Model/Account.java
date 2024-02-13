package Model;

public class Account {
    private int accountId;
    private int userId;
    private double balance;

    public Account(String args) {
        this.accountId = accountId;
        this.userId = userId;
        this.balance = balance;

    }
    public void getBalance(double balance) {
        System.out.println("Your balance is " + this.balance);
    }
    public void deposit(double funds) {
        this.balance = this.balance + funds;
    }
    public void withdraw(double funds) {
        this.balance = this.balance - funds;
    }

}
