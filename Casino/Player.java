//Name: (TJ) Thejaswin Kumaran
//Period: 3B

public class Player
{
    //Variables
    String name;
    double wallet;
    
    public Player(String n, double w)
    {
        name = n;
        wallet = w;
        
    }
    
    public boolean broke()
    {
        if (wallet == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}