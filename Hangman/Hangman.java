//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Hangman
{
    public static void main(String[] args)
    {
        ///#1
        Scanner console = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        int[] a = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
        int[] b = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};
        
        ///#2
        int count = 0;
        for (int i = 0; i < a.length; i ++)
        {
            if (((a[i] - b[i]) > -2) && (a[i] - b[i]) < 2)
            {
                count ++;
            }
        }
        System.out.println("#2 " + count);
        System.out.println("");
        System.out.println("");
        
        ///#3
        count = 0;
        for (int i = 0; i < (a.length - 1); i ++)
        {
            if ((a[i] == 2) && (a[i + 1] == 2))
            {
                count ++;
            }
            if ((a[i] == 4) && (a[i + 1] == 4))
            {
                count ++;
            }
        }
        System.out.println("#3");
        if (count > 0)
        {
            System.out.println("Two/four!");
        }
        else
        {
            System.out.println("Not two/four");
        }
        System.out.println("");
        System.out.println("");
        
        ///#4
        count = 0;
        int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = (a.length - 1); i > 0; i --)
        {
            c[count] = a[i];
            count ++;
        }
        System.out.println("#4");
        for (int i = 0; i < (a.length - 1); i ++)
        {
            System.out.println(c[i] + ", ");
        }
        System.out.println(c[15]);
        System.out.println("");
        System.out.println("");
        
        ///#5
        int big = 0;
        int small = 50;
        count = 0;
        for (int i = 0; i < a.length; i ++)
        {
            if (big < a.length)
            {
                big = a.length;
            }
            if (small > a.length)
            {
                small = a.length;
            }
        }
        System.out.println("#5");
        System.out.println("Array a has a range of " + (big - small) + " between its largest and smallest numbers");
        big = 0;
        small = 50;
        for (int i = 0; i < b.length; i ++)
        {
            if (big < b.length)
            {
                big = b.length;
            }
            if (small > b.length)
            {
                small = b.length;
            }
        }
        System.out.println("Array b has a range of " + (big - small) + " between its largest and smallest numbers");
        System.out.println("");
        System.out.println("");
        
        ///#6
        //The handle rail thingy that goes the full length of the staircase
        
        ///#7
        System.out.println("#7");
        for (int i = 0; i < (str.length - 1); i ++)
        {
            System.out.print(str[i].substring(0,1) + ", ");
        }
        System.out.println(str[str.length - 1].substring(0,1));
        
        ///#8
        count = 0;
        System.out.println("#8");
        for (int i = 0; i < str.length; i ++)
        {
            if (str[i].substring( (str[i].length() - 1) , str[i].length() ) == "e")
            {
                count ++;
            }
        }
        System.out.println(count + " words in the str array end with \"e\"");
        
        ///#9
        count = 0;
        System.out.println("#9");
        for (int i = 0; i < str.length; i ++)
        {
            count = count + str[i].length();
        }
        System.out.println("The total character length is >>> " + count);
        System.out.println("");
        System.out.println("");
        
        ///#10
        count = 0;
        System.out.println("#10");
        for (int i = 0; i < str.length; i ++)
        {
            if (str[i].length() >= 7)
            {
                count ++;
            }
        }
        if (count < 2)
        {
            System.out.println("Less than 2 len. 7!");
        }
        else
        {
            System.out.println("Two len. 7!");
        }
        
        ///#11
        //Your own Mother
        
        ///#12
        count = 0;
        System.out.println("#12");
        for (int i = 0; i < str.length; i ++)
        {
            for (int o = 0; o < (str[i].length() - 1); o ++)
            {
                if (str[i].substring( o , o + 1 ) == "e")
                {
                    count ++;
                }
            }
        }
        System.out.println(count + " of the characters is \"e\"");
        
        ///#13
        String[] hiBye = {"byhigh", "hit", "byebye", "hibye", "hilt"};
        count = 0;
        int count2 = 0;
        System.out.println("#13");
        
        //"hi" count
        for (int i = 0; i < (hiBye.length - 1); i ++)
        {
            for (int o = 0; o < (hiBye[i].length() - 2); o ++)
            {
                if (str[i].substring( o , o + 2 ) == "hi")
                {
                    count ++;
                }
            }
        }
        
        //"bye" count
        for (int i = 0; i < (hiBye.length - 1); i ++)
        {
            for (int o = 0; o < (hiBye[i].length() - 3); o ++)
            {
                if (str[i].substring( o , o + 3 ) == "bye")
                {
                    count2 ++;
                }
            }
        }
        
        if (count == count2)
        {
            System.out.println("Same hi/bye");
        }
        else
        {
            System.out.println("Not same ni/bye");
        }
        
        System.out.println("");
        System.out.println("");
        
        
        //Hangman app
        
        //Secret word
        String[] secretWord = {"F", "i", "s", "h"};
        
        count = 0;
        int score = 1;
        boolean bool = false;
        boolean win = false;
        String guess = "";
        String[] guessed = {"_", "_", "_", "_"};
        System.out.println("Hangman app >>>");
        System.out.println("Guess a letter >>> [_, _, _, _]");
        guess = console.nextLine();
        
        while (bool == false)
        {
            guess = console.nextLine();
            
            for (int i = 0; i < (guessed.length - 1); i ++)
            {
                if (guessed[i] == guess)
                {
                    guess = guessed[i];
                    count ++;
                }
            }
            
            //Score counter
            score ++;
            
            //if player won
            if (score == 10)
            {
                bool = true;
                win = false;
            }
            
            //If player finished
            if (count == 4)
            {
                bool = true;
                win = true;
            }
            else
            {
                System.out.println("");
                System.out.println("");
                System.out.println("Keep guessing");
                System.out.println("[" + guessed[0] + ", " + guessed[1] + ", "  + guessed[2] + ", " + guessed[3] + "]");
                System.out.println("You have used " + score + " attempts. You have " + (score - 10) + " attempt(s)");
            }
        }
        
        
        
        //End message
        System.out.println("");
        System.out.println("");
        if (win)
        {
            System.out.println("Congratulations! You have guessed the word");
            System.out.println("You used " + " attempts.");
        }
        else
        {
            System.out.println("Oop, the man got hung, good luck next time!");
        }
    }
}