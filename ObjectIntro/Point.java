//Name: (TJ) Thejaswin Kumaran
//Period: 3B

public class Point
{
    double x = 0;
    double y = 0;
    
    public Point(double xVal, double yVal)
    {
        x = xVal;
        y = yVal;
    }
    
    public String getString()
    {
        return "{x: " + x + ", y: " + y+ "}";
    }
}