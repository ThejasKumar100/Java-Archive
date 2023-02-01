//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class GameRunner
{   
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("How many points for the goal? >>>");
        PigGame game = new PigGame(console.nextInt());
        game.play();
    }
}