//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class ApproximatePI
{
    ///#1
    public static boolean isPositive(int a)
    {
        if (a > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    ///#2
    public static boolean isOdd(int a)
    {
        if ((a % 2) == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ///#3
    public static int getMax(int a, int b)
    {
        if (a >= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    
    ///#4
    //I legitamatly don't know
    
    
    ///#5
    public static int rollDice()
    {
        Random randomGen = new Random();
        int a = randomGen.nextInt(6);
        return a;
    }
    
    ///#6
    public static int rollDiceMore(int a)
    {
        Random randomGen = new Random();
        int result = randomGen.nextInt(a);
        return result;
    }
    
    ///#7
    public static String capitalizeFirst(String name)
    {
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        return name;
    }
    
    ///#8
    public static double circleArea(double radius)
    {
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }
    
    ///#9
    public static boolean isMultiple(int a, int b)
    {
        if ((b % a) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ///#10
    //I still don't understand it
    
    ///#11
    public static String convertTime(double time, boolean isMinutes)
    {
        double time2 = time;
        String out = "";
        if (isMinutes)
        {
            time = time * 60;
            out = (" >>> " + time2 + " minutes is " + time + " seconds");
        }
        else
        {
            time = time / 60;
            out = (" >>> " + time2 + " seconds is " + time + " minutes");
        }
        return out;
    }
    
    ///#12
    public static void printDiagonal(String s)
    {
        for (int i = 0; i < s.length(); i ++)
        {
            for (int o = i; o > 0; o --)
            {
                System.out.print(" ");
            }
            System.out.println(s.substring( (i) , (i + 1) ));
        }
    }
    
    
    
    //Approximate PI LAB
    public static double approximatePI(int iterations)
    {
        double num = 0;
        for (int i = 1; i < (iterations + 1); i ++)
        {
            if ((i % 2) == 1)
            {
                num = num + (1 / ((2 * i) + 1));
            }
            else
            {
                num = num - (1 / ((2 * i) + 1));
            }
        }
        num = num * 4;
        return num;
    }
    
    
    
    //////////////////////Main------------------------------------------------------------------------------------------------
    public static void main (String[] args)
    {
        Scanner console = new Scanner (System.in);
        

    }
}