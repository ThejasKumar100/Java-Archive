//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Casino
{
    //Variables
    Player player;
    Roulette game;
    
    public Casino()
    {
        Scanner console = new Scanner(System.in);
        player = new Player("John doe", 500);
        game = new Roulette();
        
    }
    
        public void play()
    {
        
        Scanner console = new Scanner(System.in);
        double bet = 0.00;      //User bet
        double result = 0.00;   //To store the winnings/losses of each game
        String input = "";      //User input
        
        do
        {
            
            System.out.print(player.name + ", you have " + player.wallet + ", how much would you like to bet? >>> ");
            bet = console.nextDouble();
            player.wallet -= bet;
             
            //Play a round and store the results
            result = game.placeBet(bet);
            
            if (result > 0)
            {
            		System.out.println("\nYou won " + result + "!  Nice");
            }
            else
            {
            		System.out.println("\nYou lost, bummer.");
            }
             
            //Flush the buffer
            console.nextLine();
             
            //Update wallet amount and notify user
            player.wallet += result;
            System.out.println("\nYou have $" + player.wallet + " in your wallet.");
            
            if (player.broke())
            {
            		System.out.println("Come back when you have some money, chump!");
            		return;
            }
            System.out.println("Bet again?  (Y or N) >>> ");
            input = console.nextLine();
         
        } while (!input.equalsIgnoreCase("N"));
        
    } //end method
}