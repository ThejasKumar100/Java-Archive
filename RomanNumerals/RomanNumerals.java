//Name: Thejaswin Kumarana -Cnetennial High School
//Period: 3B

import java.util.*;

public class RomanNumerals
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();
        
        ///#1
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        
        ///#2
        System.out.println("The length of str is >>> " + str.length);
        System.out.println("");
        System.out.println("");
        
        ///#3
        for (int i = 0; i < str.length; i ++)
        {
            System.out.print(str[i].substring( 0 , 1 ) + " ");
        }
        System.out.println("");
        System.out.println("");
        
        ///#4
        int count = 0;
        for (int i = 0; i < str.length; i ++)
        {
            if ((str[i].substring( str[i].length() - 1 , str[i].length() )) == "e")
            {
                count ++;
            }
        }
        System.out.println(count + " wordz in the str array end with \"e\"");
        System.out.println("");
        System.out.println("");
        
        ///#5
        count = 0;
        for (int i = 0; i < str.length; i ++)
        {
            if ((str[i].substring( str[i].length() - 1 , str[i].length() )) == "e")
            {
                count = count + str[i].length();
            }
        }
        System.out.println("");
        System.out.println("");
        
        ///#6
        count = 0;
        for (int i = 0; i < str.length; i ++)
        {
            if (str[i].length() == 7)
            {
                count ++;
            }
        }
        if (count >= 2)
        {
            System.out.println("Two length 7!");
        }
        else
        {
            System.out.println("Under 2 length 7");
        }
        System.out.println("");
        System.out.println("");
        
        ///#7
        //You were being introduced to your Mother
        
        ///#8
        count = 0;
        for (int i = 0; i < str.length; i ++)
        {
            for (int o = 0; o < str[i].length(); o ++)
            {
                if ((str[i].substring( o , o + 1 )) == "e")
                {
                    count ++;
                }
            }
        }
        System.out.println("The number of \"e\"s found in the array is >>> " + count);
        System.out.println("");
        System.out.println("");
        
        ///#9
        count = 0;
        for (int i = 0; i < str.length; i ++)
        {
            for (int o = 0; o < str[i].length(); o ++)
            {
                if ((str[i].substring( o , o + 1 )) == "o")
                {
                    count ++;
                }
            }
        }
        if (count > 0)
        {
            System.out.println("At least one o");
        }
        else
        {
            System.out.println("No o's!");
        }
        System.out.println("");
        System.out.println("");
        
        ///#10
        System.out.println("Please ask a question >>> ");
        String question = console.nextLine();
        String [] str2 = {"Ask again later", "It is certain", "No", "Yes", "Maybe", "Outlook good", "Outlook not good"};
        count = randomGen.nextInt(7);
        System.out.println(str2[count]);
        System.out.println("");
        System.out.println("");
        
        
        
        ///Roman Numerals
        final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        System.out.println("Enter an integer less than 4000");
        int in = console.nextInt();
        int in2 = in;
        String out = "";
        while (in > 2000)
        {
            out = out + "M";
            in = in - 1000;
        }
        for (int i = 0; i < 13; i ++)
        {
            if (in >= NUMBERS[i])
            {
                out = out + LETTERS[i];
                in = in - NUMBERS[i];
            }
            if (in >= NUMBERS[i])
            {
                out = out + LETTERS[i];
                in = in - NUMBERS[i];
            }
            if (in >= NUMBERS[i])
            {
                out = out + LETTERS[i];
                in = in - NUMBERS[i];
            }
        }
        if (in != 0)
        {
            System.out.println("Error#1");
        }
        System.out.println(in2 + " is " + out + " in Roman Numeral form.");
    }
}