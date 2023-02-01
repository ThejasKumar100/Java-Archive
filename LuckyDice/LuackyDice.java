//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class LuackyDice
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();
        
        ///#1
        System.out.println("Please enter an Integer >>> ");
        int x = console.nextInt();
        System.out.println("The Factors of this number is >>> ");
        for (int i = 0; i <= x; i ++)
        {
            for (int k = 0; k <= x; k ++)
            {
                if ((k * i) == x)// If the number is a factor
                {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println("");
        System.out.println("");
        
        ///#2
        System.out.println("Please enter an Integer >>> ");
        x = console.nextInt();
        int y = 0;
        for (int i = 0; i < x; i ++)
        {
            if (((i % 3) == 1) && ((i % 4) == 1) && ((i % 5) == 1) && ((i % 6) == 1))
            {
                y ++;
            }
        }
        System.out.println("There are " + y + " cool numbers from 1-" + x + ".");
        
        System.out.println("");
        System.out.println("");
        
        ///#3
        System.out.println("Please enter an Integer >>> ");
        x = console.nextInt();
        y = 0;
        while (x != 0)
        {
            if (((x % 3) == 1) && ((x % 4) == 1) && ((x % 5) == 1) && ((x % 6) == 1))
            {
                y ++;
            }
            x --;
        }
        System.out.println("There are " + y + " cool numbers from 1-" + x + ".");
        
        System.out.println("");
        System.out.println("");
        
        ///#4
        //short
        
        ///#5
        System.out.println("Please enter an Integer >>> ");
        x = console.nextInt();
        y = 0;
        for (int i = 0; i >= x; i ++)
        {
            for (int k = 0; k >= x; k ++)
            {
                if ((k * i) == x)// If the number is a factor
                {
                    y = y + i;
                }
            }
        }
        if (y == x)
        {
            System.out.println("The number you entered is a perfect number.");
        }
        else
        {
            System.out.println("The number you entered is not a perfect number");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#6
        System.out.println("Please enter an Integer >>> ");
        x = console.nextInt();
        y = 0;
        int k = 0;
        do {
            for (int i = 0; i >= x; i ++)
            {
                for (k = 0; k >= x; k ++)
                {
                    if ((k * i) == x)// If the number is a factor
                    {
                        y = y + i;
                    }
                }
            }
        }
        while (k == x);
        if (y == x)
        {
            System.out.println("The number you entered is a perfect number.");
        }
        else
        {
            System.out.println("The number you entered is not a perfect number");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#7
        //It was a one way street
        
        ///#Lucky dice app
        x = 0;
        System.out.println("How many sides does the die have? >>> ");
        int sides = console.nextInt();
        System.out.println("How many simulations do you want to run?");
        int sims = console.nextInt();
        int totalRolls = 0;
        for (int i = -1; i != sims; i ++)
        {
            int result = 0;
            int rolls = 0;
            totalRolls = 0;
            while (result <= 1000)
            {
                result = result + randomGen.nextInt(sides + 1);
                rolls ++;
            }
            System.out.println("Simulation " + i + " - number of roll to reach 1000 >>> " + result);
            totalRolls = totalRolls + rolls;
        }
        x = totalRolls / sims;
        System.out.println("");
        System.out.println("The average amount of rolls to surpass 1000 was " + x + " rolls.");
    }
}