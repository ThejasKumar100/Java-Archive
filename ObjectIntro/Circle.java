//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Circle
{
    double radius;
    double x = 0;
    
    public Circle(double rad)
    {
        radius = rad;
    }
    public double getDiameter()
    {
        x = radius * 2;
        return x;
    }
    public double getArea()
    {
        x = radius * radius * Math.PI;
        return x;
    }
    public double getCircyumference()
    {
        x = radius * 2 * Math.PI;
        return x;
    }
}