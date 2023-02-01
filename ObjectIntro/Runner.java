//Name: (TJ) Thejaswin Kumaran
//Period: 3B

public class Runner
{
    public static void main(String[] args)
    {
        Point p1 = new Point(23.14, 4.87);
        Point p2 = new Point(15.2, 6.87);
        Line line1 = new Line(p1.x, p1.y, p2.x, p2.y);
        Line line2 = new Line(12.45, 8.1, 9.2, 14.7);
        System.out.println(line1.getString());
        System.out.println(line2.getString());
        System.out.println("Line 1 slope >>> " + line1.getSlope());
        System.out.println("Line 2 slope >>> " + line2.getSlope());
    }
}