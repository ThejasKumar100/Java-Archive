//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class ChangeMaker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        
        
        ///#1
        System.out.println("#1 Please enter in a single character");
        String a = console.nextLine();
        if (isLetterA(a.charAt(0)))
        {
            System.out.println("The character you entered is an \"a\"");
        }
        else
        {
            System.out.println("The character you entered is not an \"a\"");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#2
        System.out.println("#2 Please enter in text");
        a = console.nextLine();
        if (hasTwoA(a))
        {
            System.out.println("The character you entered has more than 2 \"a\"(s)");
        }
        else
        {
            System.out.println("The character you entered has less than 2 \"a\"(s)");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#3
        System.out.println("#3 Please enter a character");
        a = console.nextLine();
        if (isVowel(a.charAt(0)))
        {
            System.out.println("The character you entered is a vowel");
        }
        else
        {
            System.out.println("The character you entered is not a vowel");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("#2 Please enter in text");
        a = console.nextLine();
        System.out.println("The text has " + numVowels(a) + " vowel(s)");
        
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("#3 Please enter the main text");
        a = console.nextLine();
        System.out.println("Please enter the 2 chars you want to look for");
        String b = console.nextLine();
        String c = console.nextLine();
        
        if (evanChars(a,b.charAt(0),c.charAt(0)))
        {
            System.out.println("Both chars have the same frequency in the text");
        }
        else
        {
            System.out.println("Both chars have different frequency in the text");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#7
        System.out.println("#7 Please enter in text");
        a = console.nextLine();
        System.out.println("Please enter the char");
        b = console.nextLine();
        if (twoInARow(a,b.charAt(0)))
        {
            System.out.println("The char you entered accured twice in a row");
        }
        else
        {
            System.out.println("The char you entered did not accur twice");
        }
        
        System.out.println("");
        System.out.println("");
        
        ///#8
        System.out.println("#8 Please enter in text");
        a = console.nextLine();
        System.out.println("The text with the vowels capatalized is >>> " + capitalizeVowels(a));
        
        System.out.println("");
        System.out.println("");
        
        ///#9
        
    }
    
    ///#1
    public static boolean isLetterA(char letter)
    {
        if (letter == 'a')
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    ///#2
    public static boolean hasTwoA(String s)
    {
        int num = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            if (s.substring( i , (i + 1) ) == "a")
            {
                num ++;
            }
        }
        if (num >= 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ///#3
    public static boolean isVowel(char letter)
    {
        if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ///#4
    public static int numVowels(String s)
    {
        int num = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            if ((s.substring( i , (i + 1) ) == "a") || (s.substring( i , (i + 1) ) == "e") || (s.substring( i , (i + 1) ) == "i") || (s.substring( i , (i + 1) ) == "o") || (s.substring( i , (i + 1) ) == "u"))
            {
                num ++;
            }
        }
        return num;
    }
    
    ///#5
    public static boolean evanChars(String s, char a, char b)
    {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < s.length(); i ++)
        {
            if (s.charAt(i) == a)
            {
                num1 ++;
            }
            if (s.charAt(i) == b)
            {
                num2 ++;
            }
        }
        
        if (num1 == num2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    ///#6
    //They all gained happiness
    
    ///#7
    public static boolean twoInARow(String s, char a)
    {
        for (int i = 0; i < s.length(); i ++)
        {
            if (s.charAt(i) == a)
            {
                if (s.charAt(i + 1) == a)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    ///#8
    public static String capitalizeVowels(String s)
    {
        String a = "";
        for (int i = 0; i < s.length(); i ++)
        {
            if ((s.substring( i , (i + 1) ) == "a") || (s.substring( i , (i + 1) ) == "e") || (s.substring( i , (i + 1) ) == "i") || (s.substring( i , (i + 1) ) == "o") || (s.substring( i , (i + 1) ) == "u"))
            {
                a = a + s.substring(i).toUpperCase();
            }
            else
            {
                a = a + s.substring(i);
            }
        }
        return a;
    }
    
    ///#9
    public static String longestWord(String s)
    {
        String[] words = s.split(" ");
        int longest = 0;
        int index = 0;
        
        for (int i = 0; i < words.length; i ++)
        {
            int temp = words[i].length();
            if (temp > longest)
            {
                longest = temp;
                index = i;
            }
        }
        
        return words[index];
    }
    
    ///#10
    public static boolean containsPrefix(String s, int n)
    {
        for (int i = 0; i < (s.length() - n); i ++)
        {
            if (s.substring(0,n) == s.substring(i,(i + n)))
            {
                return true;
            }
        }
        return false;
    }
    
    
    
    //Word Scramble
    
    //1 identification-use indexOf to isolate individual words and find required length of array
    //1.1 sorting-distribute sections of string into string array
    //2 scrambling-use indiviual command to scramble word innards
    //1.3 fusing-take leftover numbers to create string output
    public static void wordScramble(String line)
    {
        
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        String firstletter;
        
        //identification
        for (int i = 0; i < line.length(); i ++)
        {
            num ++; //Counting number of spaces
        }
        num = (num * 2) + 2;//Number of array spots required
        firstletter = line.substring(0,1);
        
        //sorting
        String[] line2 = new String[num];
        line2[0] = firstletter;
        line2[(num - 1)] = line.substring(line.length() - 1, line.length());
        
        
        //arrange and scramble
        for (int i = 0; i < (num - 2); i = i + 2)
        {
            line2[i + 1] = scramble(line.substring((line.indexOf(" ", num3) + 1),(line.indexOf(" ", num2) - 1)));
            
            if (line.indexOf(" ",num2) != -1)
            {
                line2[i + 2] = line.substring((line.indexOf(" ", num2) - 1),(line.indexOf(" ", num2) + 1));
            }
            num3 = num2;
            num2 = line.indexOf(" ",num2);
        }
        
        String line3 = "";
        for (int i = 0; i < line2.length; i ++)
        {
            line3 = line3 + line2[i];
        }
        
        System.out.println(line3);
    }
    //scramble
    public static String scramble(String input)
    {
        String input2 = "";
        for (int i = (input.length() - 1); i > 0; i ++)
        {
            input2 = input.substring(i,i + 1);
        }
        return input2;
    }
}