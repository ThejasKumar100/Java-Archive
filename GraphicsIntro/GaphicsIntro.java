class GaphicsIntro
{
    public static void main(String[] args)
    {
        //StdDraw.line(0, 1, 1, 0);
        
        ///#2
        //StdDraw.setPenColor(0, 0, 0);
        //StdDraw.filledCircle(0.5, 0.5, 0.5);
        
        //StdDraw.setPenColor(255, 255, 255);
        //StdDraw.filledCircle(0.5, 0.5, 0.4);
        
        //StdDraw.setPenColor(0, 0, 255);
        //StdDraw.filledCircle(0.5, 0.5, 0.3);
        
        //StdDraw.setPenColor(255, 0, 0);
        //StdDraw.filledCircle(0.5, 0.5, 0.2);
        
        //StdDraw.setPenColor(255, 255, 0);
        //StdDraw.filledCircle(0.5, 0.5, 0.1);
        
        
        ///#3
        //StdDraw.circle(0.5, 0.5, 0.2);
        
        ///#4
        //StdDraw.setPenColor(0, 0, 150);
        //StdDraw.filledCircle(0.5, 0.5, 0.2);
        
        //Graphics Intro
        //3
        //StdDraw.setPenColor(150, 0, 0);
        //for (int i = 0; i <= 20; i ++)
        //{
        //    StdDraw.line(0, (0.05 * i), 1, (0.05 * i));
        //}
        
        //4
        //StdDraw.setPenColor(0, 0, 150);
        //for (int i = 0; i <= 20; i ++)
        //{
        //    StdDraw.line((0.05 * i), 0, (0.05 * i), 1);
        //}
        
        //5 & 6
        
        for (int i = 0; i <= 40; i ++)
        {
            StdDraw.setPenColor(0, (3 * i), 0);
            StdDraw.line((0.025 * i), 0, 1, (0.025 * i));
        }
    }
}