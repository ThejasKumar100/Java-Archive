//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Seasons
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        int leftPressure = 1;
        System.out.println("What is the left tire pressure? >>>");
        leftPressure = console.nextInt();
        int rightPressure = 1;
        System.out.println("Whet is the right tire pressure? >>>");
        rightPressure = console.nextInt();
        if ((leftPressure < 36) || (rightPressure < 36))
        {
            System.out.println("WARNING! Low tire pressure.");
        }
        
        ///#2
        if (((leftPressure - rightPressure) >= 4) || ((leftPressure - rightPressure) <= -4))
        {
            System.out.println("WARNING! Uneven tire pressure.");
        }
        
        ///#3
        //a ton
        
        ///#4
        System.out.println("What is your grade? >>>");
        double grade = console.nextDouble();
        if ((grade >= 90) && (grade <= 100))
        {
            System.out.println("You have an A.");
        }
        else if ((grade >= 80) && (grade <= 89))
        {
            System.out.println("You have an B.");
        }
        else if ((grade >= 70) && (grade <= 79))
        {
            System.out.println("You have an C.");
        }
        else if ((grade >= 60) && (grade <= 69))
        {
            System.out.println("You have an D.");
        }
        else if (grade <= 59)
        {
            System.out.println("You have an F.");
        }
        
        ///#5
        System.out.println("Please enter a number >>>");
        int num = console.nextInt();
        int num2 = num;
        if ((num % 10) < 5)
        {
            num = num - (num2 % 10);
        }
        else if ((num % 10) >= 5)
        {
            num = (num - (num2 % 10)) + 10;
        }
        System.out.println("The rounded form of this number is " + num);
        
        //Season app
        System.out.println("What is the current month?  >>>");
        int month = console.nextInt();
        System.out.println("What is the current day? >>>");
        int day = console.nextInt();
        if ((((month >= 12) && (day >= 16)) && ((month <= 3) && (day <= 15))) || (month == 1) || (month == 2))
        {
            System.out.println("The season is Winter.");
        }
        else if ((((month >= 3) && (day >= 16)) && ((month <= 6) && (day <= 15))) || (month == 4) || (month == 5))
        {
            System.out.println("The season is Spring.");
        }
        else if ((((month >= 6) && (day >= 16)) && ((month <= 9) && (day <= 15))) || (month == 7) || (month == 8))
        {
            System.out.println("The season is Summer.");
        }
        else if ((((month >= 9) && (day >= 16)) && ((month <= 12) && (day <= 15))) || (month == 10) || (month == 11))
        {
            System.out.println("The season is Fall.");
        }
    }
}