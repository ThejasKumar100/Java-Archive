//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class CodesAndCiphers
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("Welcome to a ROT-13 cypher");
        String t = "";
        boolean bool = true;
        System.out.println("Would you like to encrypt or decrypt? (E/D) >>> ");
        t = console.nextLine();
        if (t == "E")
        {
            bool = true;
        }
        else if (t == "D")
        {
            bool = false;
        }
        
        System.out.println("Please enter in a what you want to encrypt/decrypt >>> ");
        t = console.nextLine();
        if (bool)
        {
            System.out.println("encrypt(\"" + t + "\") >>> " + encrypt(t));
        }
        else
        {
            System.out.println("decrypt(\"" + t + "\") >>> " + decrypt(t));
        }
        
        
        ///#2
        System.out.println("Welcome to a ROT-47 cypher");
        t = "";
        bool = true;
        System.out.println("Would you like to encrypt or decrypt? (E/D) >>> ");
        t = console.nextLine();
        if (t == "E")
        {
            bool = true;
        }
        else if (t == "D")
        {
            bool = false;
        }
        
        System.out.println("Please enter in a what you want to encrypt/decrypt >>> ");
        t = console.nextLine();
        if (bool)
        {
            System.out.println("encrypt(\"" + t + "\") >>> " + encrypt2(t));
        }
        else
        {
            System.out.println("decrypt(\"" + t + "\") >>> " + decrypt2(t));
        }
        
        
        
        ///#3
        System.out.println("Welcome to a Caesar cypher");
        t = "";
        bool = true;
        int num = 0;
        System.out.println("Would you like to encrypt or decrypt? (E/D) >>> ");
        t = console.nextLine();
        if (t == "E")
        {
            bool = true;
        }
        else if (t == "D")
        {
            bool = false;
        }
        
        System.out.println("What is the Caesar key?");
        num = console.nextInt();
        
        System.out.println("Please enter in a what you want to encrypt/decrypt >>> ");
        t = console.nextLine();
        if (bool)
        {
            System.out.println("encrypt(\"" + t + "\") >>> " + encrypt3(t , num));
        }
        else
        {
            System.out.println("decrypt(\"" + t + "\") >>> " + decrypt3(t , num));
        }
        
        
        ///#4
        System.out.println("Welcome to a Morse cypher");
        t = "";
        bool = true;
        num = 0;
        System.out.println("Would you like to encrypt or decrypt? (E/D) >>> ");
        t = console.nextLine();
        if (t == "E")
        {
            bool = true;
        }
        else if (t == "D")
        {
            bool = false;
        }
        
        System.out.println("Please enter in a what you want to encrypt/decrypt >>> ");
        t = console.nextLine();
        if (bool)
        {
            System.out.println("encrypt(\"" + t + "\") >>> " + encrypt4(t));
        }
        else
        {
            System.out.println("decrypt(\"" + t + "\") >>> " + decrypt4(t));
        }
    }
    
    public static String encrypt (String s)
    {
        char x = ' ';
        for (int i = 0; i < s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x > 110))
            {
                x = (char) (x - 26 + 13);
            }
            else
            {
                x = (char) (x + 13);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String decrypt (String s)
    {
        char x = ' ';
        for (int i = 0; i > s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x <= 110))
            {
                x = (char) (x + 26 - 13);
            }
            else
            {
                x = (char) (x - 13);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String encrypt2 (String s)
    {
        char x = ' ';
        for (int i = 0; i < s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x > 80))
            {
                x = (char) (x - 94 + 47);
            }
            else
            {
                x = (char) (x + 47);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String decrypt2 (String s)
    {
        char x = ' ';
        for (int i = 0; i < s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x <= 80))
            {
                x = (char) (x + 94 - 47);
            }
            else
            {
                x = (char) (x - 47);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String encrypt3 (String s, int num)
    {
        char x = ' ';
        int num2 = num * 2;
        int num3 = 122 - num;
        for (int i = 0; i < s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x > num3))
            {
                x = (char) (x - num2 + num);
            }
            else
            {
                x = (char) (x + num);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String decrypt3 (String s, int num)
    {
        char x = ' ';
        int num2 = num * 2;
        int num3 = 122 - num;
        for (int i = 0; i < s.length(); i ++)
        {
            x = s.charAt(i);
            if ((x <= num3))
            {
                x = (char) (x + num2 - num);
            }
            else
            {
                x = (char) (x - num);
            }
            
            s = s.substring(0 , i) + x + s.substring(i + 1);
        }
        return s;
    }
    
    public static String encrypt4 (String s)
    {
        String d = "";
        for (int i = 0; i < s.length(); i ++)
        {
            for (int o = 0; o < MorseCode.alphabet.length(); o ++)
            {
                if (s.substring(i, i + 1) == MorseCode.alphabet.substring(o, o + 1))
                {
                    d = d + MorseCode.morse[o];
                }
            }
        }
        return d;
    }
    
    public static String decrypt4 (String s)
    {
        String d = "";
        for (int i = 0; i < s.length(); i ++)
        {
            for (int o = 0; o < MorseCode.morse.length; o ++)
            {
                if (s.substring(i, i + 1) == MorseCode.morse[o])
                {
                    d = d + MorseCode.alphabet.substring(o, o + 1);
                }
            }
        }
        return d;
    }
}