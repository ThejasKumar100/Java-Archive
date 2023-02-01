//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        question();
        
        ///#2
        int num = 0;
        int num2 = 0;
        System.out.println("Please enter in the year (in number form)");
        num2 = console.nextInt();
        System.out.println("Please enter in the month (in number form)");
        num = console.nextInt();
        System.out.println("");
        System.out.println("");
        
        System.out.println("The month you entered has " + daysInMonth(num, num2) + " day(s).");
        System.out.println("");
        System.out.println("");
        
        //Phone number LAB
        String phoneNum = "";
        System.out.println("Please enter in the phone number using numbers, dashes and capital letters >>>");
        phoneNum = console.nextLine();
        phoneNum = PhoneNumMaker(phoneNum);
        System.out.println("The phone number is " + phoneNum);
    }
    
    public static void question()
    {
        int num = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Which of the following is a valid variable declaration in Java?");
        System.out.println("1. int la = 4;");
        System.out.println("2. double circle-area = 5.78;");
        System.out.println("3. String s = 'hello';");
        System.out.println("4. boolean whoaNow = true;");
        num = console.nextInt();
        System.out.print("");
        
        
        switch (num)
        {
            case 1:
            System.out.println("Correct");
            break;
            
            case 2:
            System.out.println("Correct");
            break;
            
            case 3:
            System.out.println("Incorrect");
            break;
            
            case 4:
            System.out.println("Correct");
            break;
        }
    }
    
    public static int daysInMonth (int month, int year)
    {
        boolean bool = true;
        
        Scanner console = new Scanner(System.in);
        
        while (bool)
        {
            bool = false;
            switch (month)
            {
                case 1:
                return 31;
                
                
                case 2:
                if ((year % 4) == 0)
                {
                    return 29;
                }
                else
                {
                    return 28;
                }
                
                
                case 3:
                return 31;
                
                
                case 4:
                return 30;
                
                
                case 5:
                return 31;
                
                
                case 6:
                return 30;
                
                
                case 7:
                return 31;
                
                
                case 8:
                return 30;
                
                
                case 9:
                return 31;
                
                
                case 10:
                return 30;
                
                
                case 11:
                return 31;
                
                
                case 12:
                return 30;
                
                
                default:
                bool = true;
                System.out.println("The perameters you entered did not work, please enter the month and year >>>");
                month = console.nextInt();
                year = console.nextInt();
            }
        }
        return 3; //filler command that won't be used
    }
    
    
    public static String PhoneNumMaker(String phone)
    {
        String out = "";
        char[] ltr = new char[phone.length()];
        boolean error = false;
        for (int i = 0; i < phone.length(); i ++)
        {
            ltr[i] = phone.charAt(i);
            switch (ltr[i])
            {
                case '-':
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    out = out + ltr[i];
                    break;
                case 'A':
                case 'B':
                case 'C':
                    out = out + "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    out = out + "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    out = out + "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    out = out + "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    out = out + "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    out = out + "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    out = out + "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    out = out + "9";
                    break;
                default:
                    error = true;
            }
        }
        return out;
    }
}