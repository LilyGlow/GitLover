package mylessons.frombook;

public class Bank
{
    private double balance;                   // account balance

    public Bank(double openingBalance) // constructor
    {
        balance = openingBalance;
    }

    public void deposit(double amount)        // makes deposit
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)       // makes withdrawal
    {
        balance = balance - amount;
    }

    public void display()                     // displays balance
    {
        System.out.println("balance=" + balance);
    }
}
