//Name: (TJ) Thejaswin Kumaran -Centennial high school
//Period: 3B

import java.util.*;

public class PrimeChecker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        for (int i = 1; i <= 9; i ++)
        {
            System.out.print(i);
        }
        System.out.println("");
        
        ///#2
        for (int i = 1; i <= 9; i ++)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        ///#3
        for (int i = 2; i <= 20; i = i + 2)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        ///#4
        for (int i = 20; i <= 25; i ++)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        ///#5
        for (int i = 10; i <= 80; i = i + 10)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        ///#6
        //Until the trees bark back? I'm not really sure
        
        ///#7
        for (int i = 0; i >= -10; i --)
        {
            System.out.print(i + " ");
        }
        System.out.println("");
        
        ///#8
        System.out.println("Please enter a number of how many astrisks you want. >>>");
        long num = console.nextInt();
        for (int i = 1; i <= num; i ++)
        {
            System.out.print("* ");
        }
        System.out.println("");
        
        ///#9
        for (int i = 1; i <= 10; i ++)
        {
            System.out.print((i * i) + " ");
        }
        System.out.println("");
        
        ///#10
        for (int i = 1; i <= 9; i ++)
        {
            if ((i % 3) != 0)
            {
                System.out.print(i + " ");
            }
            else
            {
                System.out.print("? ");
            }
        }
        System.out.println("");
        
        ///#11
        System.out.println("Please enter a number. >>> ");
        int n = console.nextInt();
        int sum = n;
        for (int i = (n - 1); i > 0; i --)
        {
            sum = sum * i;
        }
        System.out.println("The factorial of this number is >>> " + sum);
        System.out.println("");
        
        //Prime Checker Lab
        //System.out.println("Please enter an intiger. >>> ");
        long y = 8385964537L;
        long z = 0;
        boolean prime = false;
        for (long i = y; i >= 1; i --)
        {
            if ((i % 2) == 0)
            {
                prime = false;
            }
            else if ((i % i) == 0)
            {
                prime = true;
                z = i;
            }
        }
        System.out.println(z);
        if (prime == true)
        {
            System.out.println("This number is a Prime number.");
        }
        else if (prime == false)
        {
            System.out.println("This number is not a Prime number.");
        }
        System.out.println("The fact it is divisable by is >>> " + z);
    }
}