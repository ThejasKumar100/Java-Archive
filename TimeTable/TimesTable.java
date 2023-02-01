
//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;

public class TimesTable
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("1");
        System.out.println("/ \\ // \\\\ /// \\\\\\");
        System.out.println("");
        System.out.println("");
        
        ///#2
        System.out.println("2");
        System.out.println("\"This string is in quotes\"");
        System.out.println("but this one isn't");
        System.out.println("");
        System.out.println("");
        
        ///#3
        System.out.println("3");
        System.out.println("\" and \\ are \"protected\" characters");
        System.out.println("(in Java)");
        System.out.println("");
        System.out.println("");
        
        ///#4
        System.out.println("4");
        System.out.println("////////////////////////");
        System.out.println("\"\" Java is pretty fun \"\"");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("");
        System.out.println("");
        
        ///#5
        System.out.println("5");
        System.out.println("\"/\\\"\"//\\\\\"\"\"\"///\\\\\\\"\"\"");
        System.out.println("The above line is \"pretty strange \"");
        System.out.println("");
        System.out.println("");
        
        ///#6
        //4 = M(S)?
        
        ///#7
        System.out.println("7");
        System.out.println("  /\\");
        System.out.println(" //\\\\");
        System.out.println("///\\\\\\");
        System.out.println(" //\\\\");
        System.out.println("  /\\");
        System.out.println("");
        System.out.println("");
        
        ///#8
        System.out.println("8");
        System.out.println(" ///||\\\\\\");
        System.out.println("||||||||||");
        System.out.println(" \\\\\\||///");
        System.out.println("");
        System.out.println("");
        
        ///#9
        System.out.println("9");
        System.out.println("(\\/)  (°,,,°)  (\\/)");
        System.out.println("");
        
        ///#10
        //False
        
        
        //Times Table
        
        System.out.println("Please enter an integer >>> ");
        int n = console.nextInt();
        for (int i = 1; i != (n + 1); i ++)
        {
            System.out.print(i + "\t");
        }
        System.out.println("");
        n --;
        if (n != 1)
        {
            for (int x = 0; x != n; x ++)
            {
                for (int i = 1; i != (n + 2); i ++)
                {
                    System.out.print((i * (x + 2)) + "\t");
                }
                System.out.println("");
            }
        }
    }
}