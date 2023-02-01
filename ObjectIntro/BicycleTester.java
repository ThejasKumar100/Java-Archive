//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class BicycleTester
{
    public static void main(String args[])
    {
        Bicycle bike = new Bicycle("blue");
        
        bike.setSpeed(10);
        System.out.println("Color: " + bike.color);
        System.out.println("Speed: " + bike.speed);
        System.out.println("Miles traveled: " + bike.travel((double)3/60));
        System.out.println("Locationl: " + bike.speed);
        System.out.println("Miles travelled: " + bike.travel((double)3/60));
        System.out.println("Location: " + bike.location);
    }
}