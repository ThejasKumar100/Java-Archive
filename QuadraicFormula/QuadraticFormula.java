//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class QuadraticFormula
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("Please enter an intiger >>> ");
        int a = console.nextInt();
        System.out.println("Please enter another intiger >>> ");
        int b = console.nextInt();
        System.out.println("The large value of the 2 numbers is " + (Math.max(a,b)));
        System.out.println("");
        System.out.println("");
        
        ///#2
        System.out.println("Please enter a number >>> ");
        double toCube = console.nextDouble();
        System.out.println("The cube of the number you entered is >>> " + (Math.pow(toCube,3)));
        System.out.println("");
        System.out.println("");
        
        ///#3
        System.out.println("Please enter a number for your base >>> ");
        double base = console.nextDouble();
        System.out.println("Please enter a number for you exponent >>> ");
        double exponent = console.nextDouble();
        System.out.println("The result of the numbers you entered is >>> " + (Math.pow(base,exponent)));
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("Please enter a number >>> ");
        double num = console.nextDouble();
        System.out.println("Your number, when rounded to the nearest whole number, is >>> " + (Math.round(num)));
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("Please enter a number >>> ");
        double num2 = console.nextDouble();
        System.out.println("Your number, when square rooted, is >>> " + (Math.sqrt(num2)));
        System.out.println("");
        System.out.println("");
        
        ///#6
        System.out.println("Please enter length of the longest leg of the right triangle >>> ");
        double sideA = console.nextDouble();
        System.out.println("Please enter length of the longest leg of the right triangle >>> ");
        double sideB = console.nextDouble();
        System.out.println("The length of the hypotenuse is >>> " + (Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2))));
        System.out.println("");
        System.out.println("");
        
        ///#7
        //The N fell asleep?
        
        ///#8
        System.out.println("Please enter a number >>> ");
        double c = console.nextDouble();
        System.out.println("Please enter a number >>> ");
        double d = console.nextDouble();
        System.out.println("The number that is closest to zero is >>> " + Math.min(Math.abs(c),Math.abs(d)));
        System.out.println("");
        System.out.println("");
        
        ///#9
        System.out.println("What is the radius of the cylinder? >>> ");
        double cylinderRadius = console.nextDouble();
        System.out.println("What us the height of the cylinder? >>> ");
        double cylinderHeight = console.nextDouble();
        double surfaceArea = ((2 * cylinderRadius * Math.PI) * cylinderHeight) + (2 * (Math.pow(cylinderRadius,2) * Math.PI));
        System.out.println("The surace area of the cylinder is >>> " + surfaceArea);
        System.out.println("");
        System.out.println("");
        
        ///#10
        System.out.println("Please enter the radius of the sphere >>> ");
        double radius = console.nextDouble();
        double volume = (4 * Math.PI * Math.pow(radius,3)) / 3;
        System.out.println("The volume of the sphere is >>> " + volume);
        
        //Quadratic Formula Calculator
        System.out.println("The Quadratic Formula Calculator:");
        
        System.out.println("Please enter the value of A >>> ");
        double A = console.nextDouble();
        System.out.println("Please enter the value of B >>> ");
        double B = console.nextDouble();
        System.out.println("Please enter the value of C >>> ");
        double C = console.nextDouble();
        
        double root1 = ((B * -1) + Math.sqrt(Math.pow(B,2) - (4 * A * C))) / (2 * A);
        double root2 = ((B * -1) - Math.sqrt(Math.pow(B,2) - (4 * A * C))) / (2 * A);
        
        System.out.println("The value of the first root is >>> " + root1);
        System.out.println("The value of the second root is >>> " + root2);
        
        
    }
}