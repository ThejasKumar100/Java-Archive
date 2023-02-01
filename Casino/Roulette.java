//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Roulette
{
    //Variables
    
    public Roulette()
    {
        
    }
    
    public double placeBet(double bet)
    {
        boolean bool = false;
        Scanner console = new Scanner(System.in);
        Random randgen = new Random();
        int spin = 0;
        spin = randgen.nextInt(36);
        while (spin != 36)
        {
            spin = randgen.nextInt(36);
        }
        System.out.println(spin);
        if (bool)
        {
            return bet;
        }
        else
        {
            return 0;
        }
    }
}