
//Name: (TJ) Thejaswin Kumaran -Centennial high school
//Period: 3B

import java.util.*;

public class TShirtLauncher
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        
        ///#1
        System.out.println("Please enter in 2 numbers >>> ");
        double x = console.nextDouble();
        double y = console.nextDouble();
        System.out.println("The result is >>> " + (Math.PI * (Math.pow(x,6) - Math.pow(y,6))));
        System.out.println("");
        System.out.println("");
        
        
        ///#2
        System.out.println("Please enter the radius >>> ");
        double r = console.nextDouble();
        System.out.println("The volume of the sphere is >>> " + ((4 * Math.PI * (Math.pow(r,3))) / 3));
        System.out.println("");
        System.out.println("");
        
        ///#3
        System.out.println("Please enter a number >>> ");
        double z = console.nextDouble();
        System.out.println("The result is >>> " + (Math.abs(Math.pow(z,4) - 1)));
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("Please enter a number >>> ");
        x = console.nextDouble();
        System.out.println("The result is >>> " + (Math.log10(Math.abs(1 + x))));
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("Please enter a number >>> ");
        x = console.nextDouble();
        System.out.println("The result is >>> " + (Math.pow(x,2) * Math.pow(Math.E,x)));
        System.out.println("");
        System.out.println("");
        
        ///#6
        System.out.println("Please enter 2 numbers >>> ");
        double a = console.nextDouble();
        double b = console.nextDouble();
        System.out.println("The result is >>> " + (Math.sqrt(Math.pow(a,2) - Math.pow(b,2))));
        System.out.println("");
        System.out.println("");
        
        ///#7
        //Disease?
        
        ///#8
        System.out.println("What is the bearing of the runnway? >>> ");
        double bearing = console.nextDouble();
        System.out.println("The print of the runway is >>> " + ((Math.round(bearing / 10))));
        System.out.println("");
        System.out.println("");
        
        ///#9
        System.out.println("Please enter 3 numbers >>> ");
        double i = console.nextDouble();
        double j = console.nextDouble();
        double k = console.nextDouble();
        System.out.println("The smallest value of the numbers listed is >>> " + (Math.min(Math.min(i,j),k)));
        System.out.println("");
        System.out.println("");
        
        
        
        //////T-Shirt Launcher app
        
        ////input
        System.out.println("Enter the launch velocity (in meters per second) >>> ");
        double launchVelocity = console.nextDouble();
        System.out.println("Enter the launch angle (in meters per second) >>> ");
        double launchAngle = console.nextDouble();
        System.out.println("Enter the cieling hight. If there is no ceiling, enter a value larger than 1000 >>> ");
        double ceilingHeight = console.nextDouble();
        
        ////Math stuff
        
        ///Variable stuff and direction stuff
        double Xspeed = Math.abs(launchVelocity * Math.cos(launchAngle));
        double Yspeed = Math.abs(launchVelocity * Math.sin(launchAngle));
        double Xpos = 0;
        double Ypos = 0;
        boolean contact2 = false;
        boolean contact = false;
        int time = 0;
        double recordHeight = 0;
        
        while (contact == false) //While the T-shirt has not made contact with the floor, the loop will continue
        {
            ////Proccessing:
            //Time
            time ++;
            //X values
            Xpos = Xpos + Xspeed;
            //Y values
            Ypos = Ypos + Yspeed;
            Yspeed = Yspeed - 9.8;
            
            ////Output
            System.out.println("Time >> " + time + (" seconds"));
            System.out.println("    X position >>" + Xpos);
            System.out.println("    Y position >>" + Ypos);
            System.out.println("");
            
            ////Record height
            if (Ypos > recordHeight)
            {
                recordHeight = Ypos;
            }
            
            ////Contact check
            if (Ypos < 0)
            {
                contact2 = true;
                if (contact2 == true)
                {
                    contact = true;
                }
            }
        }
        System.out.println("");
        if (recordHeight >= ceilingHeight)
        {
            System.out.println("The TShirt made contact with the ceiling. Landing estimate is no longer available");
        }
        else if (recordHeight < ceilingHeight)
        {
            System.out.println("The TShirt has landed " + Xpos + " meters away from the launcher.");
            System.out.println("Its height peaked at " + recordHeight + " above the elevation of the launcher.");
        }
    }
}