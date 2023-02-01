//Name: (TJ) Thejaswin Kumaran
//Period: 3B Centennial High School

import java.util.*;

public class NutsAndBolts
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("What is the first number?");
        int num1 = console.nextInt();
        System.out.println("What is the second number?");
        int num2 = console.nextInt();
        if (num1 == num2)
        {
            System.out.println("The numbers are equal.");
        }
        else
        {
            System.out.println("The numbers are not equal.");
        }
        
        ///#2
        System.out.println("What is the total bill?");
        int totalBill = console.nextInt();
        double discount = 0;
        double finalAmount;
        if (totalBill > 2000)
        {
            System.out.println("You will get a 15% discount.");
            discount = 0.85;
        }
        else if ((totalBill <= 2000) && (totalBill >= 1000))
        {
            System.out.println("You will get a 10% discount.");
            discount = 0.9;
        }
        else if (totalBill <= 1000)
        {
            System.out.println("You will get no discount.");
            discount = 1.0;
        }
        else
        {
            System.out.println("Error");
        }
        finalAmount = totalBill * discount;
        System.out.println("Your total bill before discounts is " + totalBill);
        System.out.println("You bill after discounts are applied >>> " + finalAmount);
        
        ///#3
        System.out.println("What is the total bill?");
        int totalBill2 = console.nextInt();
        System.out.println("Do you have a coupon? Enter true or false >>>");
        boolean coupon = console.nextBoolean();
        double discount2 = 0;
        double finalAmount2;
        double discount3 = 0;
        if (totalBill2 > 2000)
        {
            System.out.println("You will get a 15% discount.");
            discount2 = 0.85;
        }
        else if ((totalBill2 <= 2000) && (totalBill2 >= 1000))
        {
            System.out.println("You will get a 10% discount.");
            discount2 = 0.9;
        }
        else if (totalBill2 <= 1000)
        {
            System.out.println("You will get no discount.");
            discount2 = 1.0;
        }
        else
        {
            System.out.println("Error");
        }
        if (coupon)
        {
            System.out.println("You have a coupon, so you will get another 5 % discount");
            discount3 = discount2 - 0.05;
        }
        
        finalAmount2 = totalBill2 * discount2;
        System.out.println("Your total bill before discounts is " + totalBill);
        System.out.println("Your bill after discounts and coupons are applied >>> " + finalAmount);
        
        ///#4
        //A cold or the flu
        
        ///#5
        System.out.println("What year is it?");
        int year = console.nextInt();
        int ifDivis = year % 4;
        int ifDivis2 = year % 100;
        int ifDivis3 = year % 400;
        if ((ifDivis == 0) && (ifDivis2 != 0) || (ifDivis3 == 0))
        {
            System.out.println("The year is a leap year.");
        }
        else
        {
            System.out.println("This year is not a leap year");
        }
        
        
        //Nuts and Bolts
        System.out.println("Hello customer!");
        System.out.println("Please get at least as many nuts as bolts and at least twice as many washers as bolts.");
        System.out.println("How many bolts would you like to buy? >>>");
        int numBolts = console.nextInt();
        System.out.println("How many nuts would you like to buy? >>>");
        int numNuts = console.nextInt();
        System.out.println("How many washers would you like to buy? >>>");
        int numWashers = console.nextInt();
        double totalPrice = (numBolts * 0.05) + (numNuts * 0.03) + (numWashers * 0.01);
        boolean fewNuts = false;
        boolean fewWashers = false;
        if (numBolts > numWashers)
        {
            fewNuts = true;
        }
        if ((2 * numWashers) > numBolts)
        {
            fewWashers = true;
        }
        if (fewNuts == true)
        {
            System.out.println("WARNING! Check order: too few nuts.");
        }
        if (fewWashers == true)
        {
            System.out.println("WARNING! Check order: too few washers.");
        }
        if ((fewNuts == false) && (fewWashers == false))
        {
            System.out.println("Order OK!");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Total cost >>> " + totalPrice);
    }
}