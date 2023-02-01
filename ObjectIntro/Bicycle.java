//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Bicycle
{
    String  color;
    double  location;
    double  speed;
    
    Bicycle (String c)
    {
        color = c;
        location = 0;
        speed = 0;
    }
    
    public void setSpeed(double newSpeed)
    {
        speed = newSpeed;
    }
    
    public void increaseSpeed(double deltaSpeed)
    {
        speed = speed + deltaSpeed;
    }
    
    public double travel(double hours)
    {
        location = location + (speed * hours);
        return location;
    
    }
}