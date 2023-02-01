//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Calculator
{
    public static void main(String[] args)
    {
        //Precode
        Scanner console = new Scanner(System.in);
        
        //Variables
        int operation;
        double num1;
        double num2;
        double result = 0;
        
        //Code
        
        //Menu page
        System.out.println("Menu Screen");
        System.out.println();
        System.out.println();
        System.out.println("Directory:");
        System.out.println("1 - addition (+)");
        System.out.println("2 - subtraction (-)");
        System.out.println("3 - multiplication (*)");
        System.out.println("4 - division (/)");
        System.out.println("5 - modulus (%)");
        System.out.println("Please choose what opperation you would like to use and enter a number >>>");
        System.out.println();
        operation = console.nextInt();
        System.out.println();
        
        //Response page 1
        if (operation == 1)
        {
            System.out.println("You have chosen addition");
        }
        else if (operation == 2)
        {
            System.out.println("You have chosen subtraction");
        }
        else if (operation == 3)
        {
            System.out.println("You have chosen multiplication");
        }
        else  if(operation == 4)
        {
            System.out.println("You have chosen division");
        }
        else  if(operation == 5)
        {
            System.out.println("You have chosen modulus");
        }
        else
        {
            System.out.println("ERROR-Invalid opperation entered");
        }
        
        //Responce page 2
        System.out.println();
        System.out.println("Please enter the first number >>>");
        num1 = console.nextDouble();
        System.out.println();
        System.out.println("Please enter the second number >>>");
        num2 = console.nextDouble();
        
        
        if (operation == 1)
        {
            result = num1 + num2;
        }
        else if (operation == 2)
        {
            result = num1 - num2;
        }
        else if (operation == 3)
        {
            result = num1 * num2;
        }
        else  if(operation == 4)
        {
            result = num1 / num2;
        }
        else  if(operation == 5)
        {
            result = num1 % num2;
        }
        
        System.out.print("Your solution is ");
        System.out.print(result);
    }
}