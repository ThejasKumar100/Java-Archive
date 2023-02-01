//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("Please enter a word >>> ");
        String s = console.nextLine();
        
        ///#2
        System.out.println(s.substring(1));
        System.out.println("");
        System.out.println("");
        
        ///#3
        int num1 = s.length();
        System.out.println(s.substring(0,(num1 - 2)));
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("Please enter in 2 words >>> ");
        String wordOne = console.nextLine();
        String wordTwo = console.nextLine();
        System.out.println(wordOne + wordTwo);
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("Please enter a word with a even number of characters >>> ");
        String evenString = console.nextLine();
        int numeven = evenString.length();
        System.out.println(evenString.substring(0,(numeven / 2)));
        System.out.println("");
        System.out.println("");
        
        ///#6
        System.out.println("Please enter 2 more words >>> ");
        String a = console.nextLine();
        String b = console.nextLine();
        a = a.substring(1);
        b = b.substring(1);
        System.out.println(a + b);
        System.out.println("");
        System.out.println("");
        
        ///#7
        //Charcoal
        
        ///#8
        System.out.println("Please enter a new word >>> ");
        a = console.nextLine();
        a = a.substring(0,2);
        boolean x = a.equals("BAD");
        if (x)
        {
            System.out.println("HAS BAD");
        }
        else
        {
            System.out.println("DOES NOT HAVE BAD");
        }
        System.out.println("");
        System.out.println("");
        
        ///#9
        System.out.println("Please enter a new word >>> ");
        b = console.nextLine();
        b = b.substring(0,2);
        x = b.equals("way");
        if (!x)
        {
            System.out.println("No way");
        }
        else
        {
            System.out.println("Has way");
        }
        System.out.println("");
        System.out.println("");
        
        ///#10
        System.out.println("Please enter a new word >>> ");
        b = console.nextLine();
        System.out.println(b.substring(1,b.length() - 2));
        System.out.println("");
        System.out.println("");
        
        ///#11
        System.out.println("Please enter a word with a odd number of characters >>> ");
        String oddString = console.nextLine();
        int numodd = oddString.length();
        System.out.println(oddString.substring((((numodd - 1) / 2) - 1),(((numodd - 1) / 2)) + 1));
        System.out.println("");
        System.out.println("");
        
        //Palindrome
        System.out.println("Please enter a word >>> ");
        String u = console.nextLine();
        String uu = "";
        for (int i = 0; i < u.length(); i ++)
        {
            uu = uu + (u.substring((u.length() - 2 - i),(u.length() - 1 - i)));
        }
        boolean r = u.equals(uu);
        if (r)
        {
            System.out.println("The word you entered is a palindrome");
        }
        else
        {
            System.out.println("The word you entered is not a palindrome");
        }
    }
}