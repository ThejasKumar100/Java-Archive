import java.util.*;

public class takeTurn
{
    public static void input()
    {
        //int stickTotal = 20;
        Scanner console = new Scanner(System.in);
        int num = 0;
        boolean bool = true;
        
        //User's turn
        System.out.println("There are " + main.stickCount + " sticks left on the board.");
        
        //Check to see if number entered is valid
        while (bool)
        {
            System.out.println("How many sticks do you want to pick up? (Enter 1, 2, or 3) >>> ");
            num = console.nextInt();
            if ((num == 1) || (num == 2) || (num == 3))
            {
                bool = false;
            }
            else
            {
                bool = true;
            }
            System.out.println("");
            System.out.println("The number needs to be 1, 2, or 3. Please enter a number again.");
        }
        System.out.println("");
        main.select = num;
        main.totals[0] = main.totals[0] + num;
    }
    
    public static void subtract(int num)
    {
        main.stickCount = main.stickCount - num;
    }
    
    public static void comMove()
    {
        int num = 0;
        Random randomGen = new Random();
        num = randomGen.nextInt(3) + 1;               //Actual com behavior
        
        main.totals[1] = main.totals[1] + num;
        
        //UI
        System.out.println("There are " + main.stickCount + " sticks left on the board.");
        main.stickCount = main.stickCount - num;
        System.out.println("The computor picks up " + num + " sticks off the board.");
        System.out.println("");
    }
    
    public static void winCheck(int num)
    {
        if(main.stickCount <= 0)
        {
            main.done = false;
            if (num == 0)
            {
                main.winner = true;   //User won
            }
            else if (num == 1)
            {
                main.winner = false;  //Com won
            }
        }
        else
        {
            main.done = true;         //Game isn't over yet
        }
    }
}