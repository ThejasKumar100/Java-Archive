//Name: (TJ) Thejaswin Kumaran - Centennial high school
//Period: 3A

import java.util.*;

public class BottlesOnTheWall
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#2
        int num = 1;
        while (num <= 9)
        {
            System.out.print(num);
            num ++;
        }
        System.out.println("");
        
        ///#3
        int num2 = 1;
        while (num2 <= 9)
        {
            System.out.print(num2 + " ");
            num2 ++;
        }
        System.out.println("");
        
        ///#4
        int num3 = 1;
        while (num3 <= 19)
        {
            System.out.print(num3 + " ");
            num3 = num3 + 2;
        }
        System.out.println("");
        
        ///#5
        int num4 = 5;
        while (num4 <= 50)
        {
            System.out.print(num4 + " ");
            num4 = num4 + 5;
        }
        System.out.println("");
        
        ///#6
        int num5 = 10;
        while (num5 >= 1)
        {
            System.out.print(num5 + " ");
            num5 --;
        }
        System.out.println("");
        
        ///#7
        //The Barman was not nice and the man left out of fear.
        
        ///#8
        int num6 = -4;
        while (num6 >= -40)
        {
            System.out.print(num6 + " ");
            num6 = num6 - 4;
        }
        System.out.println("");
        
        ///#9
        int num9 = 1;
        int num91 = 1;
        while (num9 <= 256)
        {
            System.out.print(num9 + " ");
            num9 = num9 + num91;
            num91 = num91 * 2;
        }
        System.out.println("");
        
        ///#10
        int num10 = 1000;
        while (num10 >= 3)
        {
            System.out.print(num10 + " ");
            num10 = (num10 / 2);
        }
        System.out.println("");
        
        ///#11
        int num11 = 1;
        int loopCounter = 1;
        while ((num11 == 9) || (num11 == -9))
        {
            System.out.print(num11 + " ");
            if ((loopCounter % 2) == 1)
            {
                num11 = num11 * -1;
            }
            else if ((loopCounter % 2) == 0)
            {
                num11 = num11 * -1;
                num11 ++;
            }
            else
            {
                System.out.println("ERROR");
            }
            loopCounter ++;
        }
        System.out.println("");
        System.out.println("");
        
        //Bottles on the Wall app
        System.out.println("What is your age? >>>");
        int age = console.nextInt();
        int drinkType;
        if (age > 20)
        {
            System.out.println("Do you prefer Beer or Coke? Enter 1 for Beer and 2 for Coke. >>>");
            drinkType = console.nextInt();
        }
        else
        {
            drinkType = 2;
        }
        String drink = "filler";
        if (drinkType == 1)
        {
            drink = "cans of Beer";
        }
        else if (drinkType == 2)
        {
            drink = "bottles of Coke";
        }
        else
        {
            System.out.println("ERROR");
        }
        
        //Song section
        int songVerseNumber = 100;
        while (songVerseNumber > 0)
        {
            System.out.println(songVerseNumber + " " + drink + " on the wall,");
            System.out.println(songVerseNumber + " " + drink + ",");
            songVerseNumber --;
            System.out.println("Take one down, pass it around, " + songVerseNumber + " " + drink + " one the wall!");
            System.out.println("");
        }
    }
}