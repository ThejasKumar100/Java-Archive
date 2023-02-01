//Name: (TJ) Thejaswin Kumaran
//School: Centennial High School
//Period: 3B

import java.util.*;


public class HailstoneSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // #1
        int num1 = 1;
        int sum = 0; //Initializing sum to 0
        while (num1 != 0)
        {
            System.out.println("Please enter a number (or press 0 to quit) >>> ");
            num1 = console.nextInt();
            if (num1 != 0)
            {
                sum = sum + num1;
            }
        }
        System.out.println("The sum of numbers entered is " + sum);
        System.out.println("");
        System.out.println("");
        
        // #2
        //8 years old
        
        // #3
        int rdpp = 100; //rdpp = Remaining Drug Potency Percentage
        int month = 0;
        boolean potency = true;
        while (potency == true)
        {
            System.out.print("Month " + month + " Potency >>> " + rdpp);
            if (rdpp <= 50)
            {
                potency = false;
                System.out.print(" DRUG EXPIRED, PLEASE DISCARD");
            }
            System.out.println("");
            month ++;
            rdpp = rdpp - 12;
        }
        System.out.println("");
        System.out.println("");
        
        ///#4
        int pin = 8525;
        boolean lock = true;
        int userPIN;
        int attempts = 0;
        while ((lock == true) && (attempts != 3))
        {
            System.out.println("Please enter password pin >>> ");
            userPIN = console.nextInt();
            if (userPIN == pin)
            {
                System.out.println("Access Granted");
                lock = false;
            }
            else if (userPIN != pin)
            {
                System.out.println("Access Denied, please re-enter PIN");
                System.out.println("You have " + (3 - attempts) + " remaining.");
                lock = true;
            }
            attempts ++;
        }
        if (attempts == 3)
        {
            System.out.println("Attempt limit exceeded. System locked");
            lock = true;
        }
        System.out.println("");
        System.out.println("");
        
        //Hailstone Series
        System.out.println("Please enter an integer between 1 and 1000 >>>");
        int num3 = console.nextInt();
        while ((num3 <= 1) && (num3 >= 1000))
        {
            System.out.println("The number you entered is not within the perameters, please enter an acceptable value.");
            num3 = console.nextInt();
        }
        //Generate Hailstone Series
        int steps = 0;
        if ((num3 % 2) == 0)
        {
            while (num3 != 1)
            {
                System.out.println(num3);
                num3 = num3 / 2;
                steps ++;
            }
        }
        else if ((num3 % 2) == 1)
        {
            while (num3 != 1)
            {
                System.out.println(num3);
                num3 = (3 * num3) + 1;
                steps ++;
            }
        }
        System.out.println("This series took " + steps + " steps to reach the value of 1 using the hailstone series.");
    }
}