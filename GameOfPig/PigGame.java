//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class PigGame
{
    //Initialized Fields, set to defaults, clarify in later code
    Player player1;
    Player player2;
    Die die;
    int goal;
    
    public PigGame(int goalPoints)//Parameters are set in this method
    {
        Scanner console = new Scanner(System.in);
        
        goal = goalPoints;
        
        System.out.println("Player 1, what is your name? >>> ");
        player1 = new Player(console.nextLine());
        System.out.println("Player 2, what is your name? >>> ");
        player2 = new Player(console.nextLine());
    }
    
    public void play()
    {
        boolean bool = true;
        
        
        while (bool)//Game loop
        {
            
            player1.takeTurn();
            
            //Whether or not to end the game loop
            if (player1.score > goal)
            {
                bool = false;
            }
            else
            {
                player2.takeTurn();
                
                if (player2.score > goal)
                {
                    bool = false;
                }
            }
            
        }
        
        if (player1.score > player2.score) //Player 1 won
        {
            System.out.println("Congrats! " + player1.name + " won the game!");
        }
        else //Player 2 won
        {
            System.out.println("Congrats! " + player2.name + " won the game!");
        }
    }
    
    public void printIntructions()
    {
        System.out.println("In the Game of Pig, two players roll a die until one player reacher " + goal + " points.");
        System.out.println("Each turn, one player keeps rolling until they either \"hold\" or roll a 1.");
        System.out.println("If a player rolls a 1, they lose all the points they've accumulated.");
        System.out.println("If a player \"holds\", all the points they're accumulated that turn are add to their score.");
    }
}