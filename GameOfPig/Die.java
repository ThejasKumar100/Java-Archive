//Name: (TJ) Thejaswin Kumaran
//Period: 3B

import java.util.*;

public class Die
{
    int numFaces = 6;
    
    public Die()
    {
        numFaces = 6;
    }
    
    public Die(int faces)
    {
        numFaces = faces;
    }
    
    public int roll()
    {
        Random randomGen = new Random();
        return randomGen.nextInt(numFaces) + 1;
    }
}