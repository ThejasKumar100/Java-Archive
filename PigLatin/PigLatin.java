//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("#1 Please enter a word >>> ");
        String str = console.nextLine();
        String b = str.substring(0,1);
        System.out.println((str.substring(0,1).toUpperCase()) + str.substring(1,(str.length())));
        System.out.println("");
        System.out.println("");
        
        ///#2
        System.out.println("#2 Please enter another word >>> ");
        str = console.nextLine();
        System.out.println(str);
        System.out.println();
        System.out.println();
        
        ///#3
        System.out.println("#3 Please enter another word >>> ");
        str = console.nextLine();
        String str2 = "e";
        int count = 0;
        for (int i = 0; i < (str.length()); i ++)
        {
            if (str2.equals(str.substring(i,i + 1)))
            {
                count ++;
            }
        }
        System.out.println("The letter \"e\" was used " + count + " time(s)");
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("#4 Please enter another word >>> ");
        str = console.nextLine();
        str2 = "hi";
        count = 0;
        for (int i = 0; i < (str.length() - 1); i ++)
        {
            if (str2.equals(str.substring(i,i + 2)))
            {
                count = count + 1;
            }
        }
        System.out.println("The phrase \"hi\" appeared " + count + " time(s).");
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("#5 Please enter a new word >>> ");
        str = console.nextLine();
        System.out.println("What target phrase would you like to look for? >>> ");
        String target = console.nextLine();
        boolean bool = false;
        for (int i = 0; (i + target.length()) <= (str.length()); i ++)
        {
            if (target.equals(str.substring(i,(i + target.length()))))
            {
                bool = true;
            }
        }
        if (bool == true)
        {
            System.out.print("Found it!");
        }
        else
        {
            System.out.println("Nope!");
        }
        System.out.println("");
        System.out.println("");
        
        ///#6
        System.out.println("#6 Please enter a word >>> ");
        str = console.nextLine();
        System.out.println("Please enter an integer >>> ");
        count = console.nextInt();
        for (int i = 0; i < count; i ++)
        {
            System.out.print((str.substring((str.length() - count),(str.length()))));
        }
        System.out.println("");
        System.out.println("");
        
        ///#7
        //This part wasn't able to be finished
        //System.out.println("#7 Please enter your email address >>> ");
        
        //Following Line of code was the source of the issue, fo some reason it doesn't want to run,
        //resulting in the following code causing an error. For that reason I commented out all of #7
        //str = console.nextLine();
        
        //count = str.indexOf("@");
        //System.out.println(count);
        //System.out.println("The domain of this email address is >>> " + (str.substring(count,str.length())));
        //System.out.println("");
        //System.out.println("");
        
        ///#8
        //System.out.println("#8 Please enter your full name >>> ");
        //str = console.nextLine();
        //str2 = " ";
        //for (int i = 0; (i + 1) <= (str.length()); i ++)
        //{
        //    if (str2.equals(str.substring(i,(i + 1))))
        //    {
        //        count = i;
        //    }
        //}
        //System.out.println(count);
        //str = str.substring(0,count) + str.substring(count,str.length()).toUpperCase();
        //System.out.println(str);
        //System.out.println("");
        //System.out.println("");
        
        ///#9
        //He didn't have cups or taps?
        
        ///#10
        //System.out.println("Please enter another word >>> ");
        //str = console.nextLine();
        //target = "*";
        //for (int i = 0; i <= str.length(); i ++)
        //{
        //    {
        //        str = str.substring(0 , i) + str.substring((i + 1) , (str.length()));
        //    }
        //}
        //System.out.println(str);
        
        
        
        
        
        //PigLatin
        str2 = "quit";
        boolean quit = false;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        
        while (quit == false)
        {
            System.out.println("Please enter a word >>> ");
            str = console.nextLine();
            if ((str.substring(0,1) == "a") || (str.substring(0,1) == "e") || (str.substring(0,1) == "i") || (str.substring(0,1) == "o") || (str.substring(0,1) == "u"))
            {
                str = str + "hay";
            }
            else if (str.equals(str2))
            {
                quit = true;
            }
            else// if consonant
            {
                num1 = str.indexOf("a");
                num2 = str.indexOf("e");
                num3 = str.indexOf("i");
                num4 = str.indexOf("o");
                num5 = str.indexOf("u");
                num1 = Math.min( (Math.min(num1,num2)) , (Math.min( (Math.min(num3,num4)) , (num5) )) );
                if (num1 != -1)
                {
                    str2 = str.substring(0,num1);
                }
                str = str + str2;
                str = str + "ay";
            }
            System.out.println(str);
        }
    }
}