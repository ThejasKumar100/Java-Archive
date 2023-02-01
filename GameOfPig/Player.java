//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Player
{
    String name;
    int score;
    
    public Player(String pName)
    {
        name = pName;
        score = 0;
    }
    
    public void takeTurn()
    {
        Scanner console = new Scanner(System.in);
        String input = "";
        System.out.println("Would you like to Roll dice or Hold? (r/h)");
        input = console.nextLine();
        Die die1 = new Die();
        int num = 0;
        
        //If the player holds
        if (input == "h" || input == "hold" || input == "Hold")
        {
            System.out.println("");
            System.out.println(name + ", your currect score is >>> " + score);
            
        }
        
        
        //If the player rolls
        else if (input == "r" || input == "roll" || input == "Roll")
        {
            num = die1.roll();
            if (num == 1)
            {
                System.out.println("You rolled a PIG, Bummer!");
                score = 0;
            }
            else
            {
                System.out.println("You rolled a " + num);
                score = score + num;
                System.out.print("Score total = " + score + ". ");
            }
        }
        
        //Contingency
        else
        {
            System.out.println("");
            System.out.println("Program error in Player class. Possible invalid input");
        }
    }
}