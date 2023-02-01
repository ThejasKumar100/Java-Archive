//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class MidYearReview
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        
        ///#2
        String someString;
        int someInt;
        double someDouble;
        boolean someBoolean;
        
        ///#3
        System.out.println("Please enter some text >>> ");
        someString = console.nextLine();
        System.out.println("Please enter an intiger >>> ");
        someInt = console.nextInt();
        System.out.println("Please enter a number with or without a decimal >>> ");
        someDouble = console.nextDouble();
        System.out.println("Please say true or false >>> ");
        someBoolean = console.nextBoolean();
        
        System.out.println("The variables you entered are as follows >>> " + someString + " " + someInt + " " + someDouble + " " + someBoolean);
        
        
        ///#4
        System.out.println("Please enter the weight of the object in pounds >>> ");
        double pounds = console.nextDouble();
        System.out.println("The weight of the object in kilograms is " + (pounds * 0.453592));
        
        
        ///#5
        System.out.println("Please enter your age >>> ");
        int age = console.nextInt();
        if (age >= 18)
        {
            System.out.println("You are of legal age to vote");
        }
        else
        {
            System.out.println("You are not of legal age to vote");
        }
        
        ///#6
        System.out.println("Please enter in a number >>> ");
        int num = console.nextInt();
        if (num > 0)
        {
            System.out.println("The number you entered is a positive number");
        }
        else if (num == 0)
        {
            System.out.println("The number you entered is 0");
        }
        else
        {
            System.out.println("The number you entered is a negative number");
        }
        
        
        ///#7
        System.out.println("Please enter in 2 numbers >>> ");
        int a = console.nextInt();
        int b = console.nextInt();
        if ((a <= 20) && (a >= 10))
        {
            System.out.println("Within");
        }
        else if ((b <= 20) && (b >= 10))
        {
            System.out.println("Within");
        }
        else
        {
            System.out.println("Not Within");
        }
        
        
        ///#8
        System.out.println("Is there loud music? (true/false) >>> ");
        boolean isLoud = console.nextBoolean();
        System.out.println("What hour is it (24 hour) >>> ");
        int time = console.nextInt();
        if (((time <= 6) || (time >= 18)) && (isLoud == true))
        {
            System.out.println("You are in trouble");
        }
        else
        {
            System.out.println("You are not in trouble");
        }
        
        ///#9
        int y = 3;
        while (y != 1004)
        {
            System.out.println(y);
            y++;
        }
        
        ///#10
        //The captain wanted people like Pete to undo his mistakes?
        
        ///#11
        for (int i = 1; i < 1001; i ++)
        {
            if (((i % 9 == 0) && (i % 2) == 0))
            {
                System.out.println(i);
            }
        }
        
        ///#12
        double total = 0;
        double enter = 2;
        while (enter != 0)
        {
            System.out.println("Please enter a value (enter 0 to stop) >>> ");
            enter = console.nextDouble();
            total = total + enter;
        }
        System.out.println("Total >>> " + total);
        
        ///#13
        double average = 0;
        double enter2 = 2;
        double counter = 0;
        while (enter2 != 0)
        {
            System.out.println("Please enter a value (enter 0 to stop) >>> ");
            enter2 = console.nextDouble();
            total = total + enter2;
            counter = counter + 1;
        }
        average = total / counter;
        System.out.println("Average >>> " + average);
    }
}