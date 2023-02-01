//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
    
        Scanner console = new Scanner(System.in);
        
        String txt = "";
        int num = 0;
        
        
        int x = 1;
        
        System.out.println(x + (x + 5));
        x = x + (5 * 2);
        System.out.println(x);
        
        
        //Bank account
        BankAccount b1 = new BankAccount("Mackenize", 400);
        BankAccount b2 = new BankAccount("Zachary", 200);
        BankAccount b3 = new BankAccount("John Doe", 445);
        
        
        ///#1
        if (b1.balance == Math.max(b1.balance,b2.balance))
        {
            if (b1.balance == Math.max(b1.balance,b3.balance))
            {
                System.out.println(b1.name + " has the most money.");
            }
            else
            {
                System.out.println(b3.name + " has the most money.");
            }
        }
        else
        {
            if (b2.balance == Math.max(b2.balance,b3.balance))
            {
                System.out.println(b2.name + " has the most money.");
            }
            else
            {
                System.out.println(b3.name + " has the most money.");
            }
        }
        
        ///#2
        System.out.println("Please enter your name >>> ");
        txt = console.nextLine();
        System.out.println("How much money would you like to Withdraw?");
        num = console.nextInt();////////////////////////What array is the data stored in and where is said array?
        b1.withdraw(num);
        System.out.println("The new account balance for " + b1.name + " is >>> " + b1.balance);
        
        //Bicycle
        BicycleTester main;
        
        
        //Circle
        CircleRunner main2;
    }
}
