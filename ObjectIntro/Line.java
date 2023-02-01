//Name: (TJ) Thejaswin Kumaran
//Period: 3B

public class Line
{
    Point firstPoint;
    Point secondPoint;
    double num = 0;
    double num2 = 0;
    
    public Line (double x1, double y1, double x2, double y2)
    {
        firstPoint = new Point(x1,y1);
        secondPoint = new Point(x2,y2);
    }
    
    public Line (Point p1, Point p2)
    {
        Point firstPoint = p1;
        Point secondPoint = p2;
    }
    
    public double getSlope()
    {
        num = secondPoint.y - firstPoint.y;
        num2 = secondPoint.x - firstPoint.x;
        num2 = num/num2;
        return num2;
    }
    
    public String getString()
    {
        return "<Point one: " + firstPoint.getString() + ", Point two: " + secondPoint.getString() + ">";
    }
    
}