//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class main
{
    static int stickCount;
    static int select;
    static boolean winner = false; //false = computor.....true = User
    static boolean done = true;
    static int[] totals = new int[2]; //[0] for User....[1] for Com
    
    public static void main(String[] args)
    {
        //Instructions
        initialize();
        System.out.println("Welcome to the Game of Sticks");
        System.out.println("Directions: There are 20 sticks on the board. You will be polaying against the computor. You will be taking your turn first. ");
        System.out.println("You will enter a number between 1 and 3 to remove sticks. Then the computor will randomly generate a number between 1 and 3 to remove its sticks off the board. ");
        System.out.println("This repeats until all the sticks are removed. The last one to remove the last stick off the board loses the game. Lets get started!");
        System.out.println("");
        
        
        
        takeTurn turn = new takeTurn();
        
        while (done)
        {
            turn.input();
            turn.subtract(select);
            turn.winCheck(0);
            if (done)
            {
                turn.comMove();
                turn.winCheck(1);
            }
        }
        
        if (winner)
        {
            System.out.println("You won the game! Congratulations!");
        }
        else
        {
            System.out.println("The computor won the game! Better luck next time!");
        }
        System.out.println("");
        System.out.println("You picked " + totals[0] + " sticks from the board.");
        System.out.println("The computor picked up " + totals[1] + " sticks from the board.");
    }
    
    public static void initialize()
    {
        main.stickCount = 20;
    }
}