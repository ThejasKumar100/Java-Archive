//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;
public class GuessingGame
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        System.out.println("Please enter a number greater than 1. >>>");
        int n = console.nextInt();
        while (n > 0)
        {
            System.out.print(n + " ");
            n --;
        }
        System.out.println("");
        
        ///#2
        System.out.println("Please enter another number greater than 1. >>>");
        n = console.nextInt();
        int n2 = 0;
        int n3 = n;
        while (n > 0)
        {
            n2 = n2 + n;
            n --;
        }
        System.out.println("The sum of all the numbers between 1 and " + n3 + ". >>> " + n2);
        
        ///#3
        System.out.println("Please enter another number greater than 1. >>> ");
        n = console.nextInt();
        n3 = n;
        n2 = 0;
        if ((n % 2) == 0)
        {
            while (n > 1)
        {
            n2 = n2 + n;
            n = n - 2;
        }
        }
        else if ((n % 2) == 1)
        {
            n --;
            while (n > 1)
        {
            n2 = n2 + n;
            n = n - 2;
        }
        }
        else
        {
            System.out.println("ERROR- problem 3");
        }
        System.out.println("The sum of all the even numbers between 1 and " + n3 + ". >>> " + n2);
        
        ///#4
        //Normal?
        
        ///#5
        System.out.println("Please enter another number greater than 1. >>> ");
        n = console.nextInt();
        n3 = n;
        n2 = 0;
        int n4 = (n % 7);
        if ((n % 7) == 0)
        {
            while (n > 1)
        {
            n2 = n2 + n;
            n = n - 7;
        }
        }
        else if ((n % 7) != 1)
        {
            n = n - n4;
            while (n > 1)
        {
            n2 = n2 + n;
            n = n - 7;
        }
        }
        else
        {
            System.out.println("ERROR- problem 3");
        }
        System.out.println("The sum of all the multiples of 7 between 1 and " + n3 + ". >>> " + n2);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        //Guessing Game lab -pseudocode
        //1. Generate random number and store it as variable. 
        //2. Create a boolean to state whether the user correctly guessed the number or not.
        //3. Create a while loop that repeates until the user gets the number correctly.
        //4. In this while loop, the user will b prompted to guess the number. 
        //5. The program then responds whether the guess was more, less or equal to the number by using a 3 branch if statement.
        //6. When the user gets the number correct, the boolean is flipped, stopping the while loop and giveing a end screen stateting the amount of attempts used.
        //7. Attempts can be recorded by increasing a variable established before the if statement every iteration of the while loop.
        
        
        //Guessing Game lab code
        Random randomGen = new Random();
        int number = randomGen.nextInt(1000) + 1;
        boolean correctGuess = false;
        int guess = 0;
        int numGuesses = 0;
        while (correctGuess != true)
        {
            System.out.println("Please guess the number between 1 and 1000.");
            guess = console.nextInt();
            if (guess == number)
            {
                correctGuess = true;
            }
            else if (guess >= number)
            {
                System.out.println("Your guess is too high, guess a lower number.");
            }
            else if (guess <= number)
            {
                System.out.println("Your guess is too low, guess a higher number.");
            }
            numGuesses ++;
        }
        System.out.println("Congratulations, you have guess the number correcty!");
        System.out.println("You have used " + numGuesses + " guesses.");
    }
}