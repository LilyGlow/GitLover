package mylessons.frombook.chapter1;
import java.util.*;



public class BankApp
{
    public static void main(String[] args) throws InterruptedException {


        System.out.print("Insert your balance please: ");
        //Timer waiting = new Timer;

        double openingbalancein;
        Scanner doublein = new Scanner(System.in);
        openingbalancein = doublein.nextDouble();

        Bank ba1 = new Bank(openingbalancein); // create acct


       // ba1.display();                         // display balance

        ba1.deposit(74.35);                    // make deposit
        ba1.withdraw(20.00);                   // make withdrawal

        System.out.println("Im searching for transactions, please, wait");//lie lie lie
        Thread.sleep(1500);
        System.out.print("5  ");
        Thread.sleep(1500);
        System.out.print("4  ");
        Thread.sleep(1500);
        System.out.print("3  ");
        Thread.sleep(1500);
        System.out.print("2  ");
        Thread.sleep(1000);
        System.out.println("1  ");
        Thread.sleep(1000);
        System.out.print("Your ");
        ba1.display();                         // display balance
    }  // end main()
}