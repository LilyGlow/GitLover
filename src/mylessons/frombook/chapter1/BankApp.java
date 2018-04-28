package mylessons.frombook.chapter1;
import java.util.Scanner;



public class BankApp
{
    public static void main(String[] args)
    {


        System.out.print("Insert your balance please: ");

        double openingbalancein;
        Scanner doublein = new Scanner(System.in);
        openingbalancein = doublein.nextDouble();

        Bank ba1 = new Bank(openingbalancein); // create acct


       // ba1.display();                         // display balance

        ba1.deposit(74.35);                    // make deposit
        ba1.withdraw(20.00);                   // make withdrawal

        System.out.println("Im searching for transactions, please, wait");//lie lie lie
        System.out.println("5 4 3 2 1");
        System.out.print("Now your balance is : ");
        ba1.display();                         // display balance
    }  // end main()
}