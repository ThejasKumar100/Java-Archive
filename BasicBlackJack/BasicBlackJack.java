//Name: (TJ) Thejaswin Kumaran
//Class: 3B
//School: Centennial

import java.util.*;

public class BasicBlackJack
{
    public static void main(String[] args)
    {
        //Precode
        Scanner console = new Scanner(System.in);
        
        
        ///#2
        int apples;
        System.out.println("How many apples are there? >>>");
        apples = console.nextInt();
        if (apples >= 0)
        {
            System.out.println("Hello world");
            System.out.println();
            System.out.println();
        }
        
        ///#3 and #4
        System.out.println("Please enter a new amount of apples >>>");
        apples = console.nextInt();
        int x = apples % 2;
        if (x == 0)
        {
            System.out.println("This is an even amount of apples");
        }
        else
        {
            System.out.println("Hmm, that's odd!");
        }
        System.out.println();
        System.out.println();
        
        ///#5
        int votingAge = 18;
        System.out.println("How old are you? >>>");
        int actualAge = console.nextInt();
        if (actualAge >= 18)
        {
            System.out.println("You can vote");
        }
        else
        {
            System.out.println("You cannot vote");
        }
        System.out.println();
        System.out.println();
        
        ///#6-----Part 1, getting values
        int angle1 = 1;
        int angle2 = 1;
        int angle3 = 1;
        System.out.println("What is the measure of the first angle of the triangle? >>>");
        angle1 = console.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("What is the measure of the second angle of the triangle? >>>");
        angle2 = console.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("What is the measure of the third angle of the triangle? >>>");
        angle3 = console.nextInt();
        
        if (angle1 + angle2 + angle3 != 180)
        {
            System.out.println("Error, units entered are false. Angle measurements do not add up to 180 degrees");
        }
        
        //additional variables
        int a = 1;
        int b = 1;
        int c = 1;
        
        ///#6-----Part 2, ordering values
        
        if ((angle1 > angle2) && (angle1 > angle3))
        {
            if (angle2 > angle3)
            {
                
            }
            else if (angle3 > angle2)
            {
                a = angle3;
                angle3 = angle2;
                angle2 = a;
            }
        }
        else if((angle1 > angle2) && (angle1 < angle3))
        {
            a = angle1;
            angle1 = angle3;
            angle3 = a;
        }
        else if((angle1 < angle2) && (angle1 < angle3))
        {
            a = angle2;
            angle2 = angle1;
            angle1 = a;
        }
        if ((angle1 > angle2) && (angle1 > angle3))
        {
            if (angle2 > angle3)
            {
                
            }
            else if (angle3 > angle2)
            {
                a = angle3;
                angle3 = angle2;
                angle2 = a;
            }
        }
        else if((angle1 > angle2) && (angle1 < angle3))
        {
            a = angle1;
            angle1 = angle3;
            angle3 = a;
        }
        else if((angle1 < angle2) && (angle1 < angle3))
        {
            a = angle2;
            angle2 = angle1;
            angle1 = a;
        }
        
        
        
        ///#6-----Identifying the triangle
        String triangleIdentity = "stock";
        
        if ((angle1 == 60) && (angle2 == 60) && (angle3 == 60))
        {
            triangleIdentity = "Equilateral";
        }
        else if ((angle3 + angle2) > 120)
        {
            triangleIdentity = "Obtuse";
        }
        else if ((angle3 + angle2) < 120)
        {
            triangleIdentity = "Scalene";
        }
        
        System.out.println("The triangle is a " + triangleIdentity + " triangle");
        
        ///#7Vines
        
        System.out.println();
        System.out.println();
        
        ///#8
        int player1;
        int player2;
        System.out.print("Player 1: Type 1 for paper, 2 for rock, or 3 for scissors >>> ");
        player1 = console.nextInt();
        System.out.print("Player 2: Type 1 for paper, 2 for rock, or 3 for scissors >>> ");
        player2 = console.nextInt();
        
        if((player1 == 1) && (player2 == 1))
        {
            System.out.println("Both players chose paper, Tie");
        }
        else if ((player1 == 2) && (player2 == 2))
        {
            System.out.println("Both players chose rock, Tie");
        }
        else if ((player1 == 3) && (player2 == 3))
        {
            System.out.println("Both players chose scissors, Tie");
        }
        else if ((player1 == 1) && (player2 == 2))
        {
            System.out.println("Player 1 wins, paper v rock");
        }
        else if ((player1 == 1) && (player2 == 3))
        {
            System.out.println("Player 2 wins, paper v scissors");
        }
        else if ((player1 == 2) && (player2 == 1))
        {
            System.out.println("Player 2 wins, rock v paper");
        }
        else if ((player1 == 2) && (player2 == 3))
        {
            System.out.println("Player 1 wins, rock v scissors");
        }
        else if ((player1 == 3) && (player2 == 1))
        {
            System.out.println("Player 1 wins, scissors v paper");
        }
        else if ((player1 == 3) && (player2 == 2))
        {
            System.out.println("Player 2 wins, scissors v rock");
        }
    }
}