//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class BankAccount
{
    String name;
    double balance;
    
    Scanner console = new Scanner(System.in);
    
    public BankAccount(String n, double bal)
    {
        name = n;
        balance = bal;
    }
    
    public void deposit(double amt)
    {
        balance = balance + amt;
    }
    
    public void withdraw(double amt)
    {
        balance = balance - amt;
    }
}