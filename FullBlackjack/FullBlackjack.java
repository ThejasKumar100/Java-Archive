//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;
public class FullBlackjack
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();
        
        //------------------------Initial Variables--------------------------------
        boolean continu = true;  //Used Continu instead of Continue since Continue is considered a reserved word in Java
        int sum = 0;
        int dealerSum = 0;
        int x;
        String cards = " ";
        String dealerCards = " ";
        int faceGen;   //Used to randomlly generate what face card you got
        int stay = 0;
        //------------------------Code - Starting round------------------------------------
        
        //First Initial card
        x = randomGen.nextInt(10 + 2);
        if (x == 2)
        {
            sum = sum + x;
            cards = cards + "2";
        }
        else if (x == 3)
        {
            sum = sum + x;
            cards = cards + "3";
        }
        else if (x == 4)
        {
            sum = sum + x;
            cards = cards + "4";
        }
        else if (x == 5)
        {
            sum = sum + x;
            cards = cards + "5";
        }
        else if (x == 6)
        {
            sum = sum + x;
            cards = cards + "6";
        }
        else if (x == 7)
        {
            sum = sum + x;
            cards = cards + "7";
        }
        else if (x == 8)
        {
            sum = sum + x;
            cards = cards + "8";
        }
        else if (x == 9)
        {
            sum = sum + x;
            cards = cards + "9";
        }
        else if ((x >= 10) && (x <= 12))
        {
            sum = sum + 10;
            if (x == 10)
            {
                cards = cards + "King";
            }
            else if (x == 11)
            {
                cards = cards + "Queen";
            }
            else if (x == 12)
            {
                cards = cards + "Jack";
            }
        }
        else if (x == 13)
        {
            sum = sum + x - 2;
            cards = cards + "Ace";
        }
        
        //Second initial card
        
        x = randomGen.nextInt(10 + 2);
        if (x == 2)
        {
            sum = sum + x;
            cards = cards + ", 2";
        }
        else if (x == 3)
        {
            sum = sum + x;
            cards = cards + ", 3";
        }
        else if (x == 4)
        {
            sum = sum + x;
            cards = cards + ", 4";
        }
        else if (x == 5)
        {
            sum = sum + x;
            cards = cards + ", 5";
        }
        else if (x == 6)
        {
            sum = sum + x;
            cards = cards + ", 6";
        }
        else if (x == 7)
        {
            sum = sum + x;
            cards = cards + ", 7";
        }
        else if (x == 8)
        {
            sum = sum + x;
            cards = cards + ", 8";
        }
        else if (x == 9)
        {
            sum = sum + x;
            cards = cards + ", 9";
        }
        else if ((x >= 10) && (x <= 12))
        {
            sum = sum + 10;
            if (x == 10)
            {
                cards = cards + ", King";
            }
            else if (x == 11)
            {
                cards = cards + ", Queen";
            }
            else if (x == 12)
            {
                cards = cards + ", Jack";
            }
        }
        else if (x == 13)
        {
            sum = sum + x - 2;
            cards = cards + ", Ace";
        }
        
        
        while (continu == true)
        {
            System.out.println("Your cards are >>> " + cards);
            System.out.println("That totals to " + sum);
            System.out.println("Would you like to hit or stay? (1 for hit and 2 for stay)");
            stay = console.nextInt();
            if (stay == 1) //Hit
            {
                    
                x = randomGen.nextInt(10 + 2);
                if (x == 2)
                {
                    sum = sum + x;
                    cards = cards + ", 2";
                }
                else if (x == 3)
                {
                    sum = sum + x;
                    cards = cards + ", 3";
                }
                else if (x == 4)
                {
                    sum = sum + x;
                    cards = cards + ", 4";
                }
                else if (x == 5)
                {
                    sum = sum + x;
                    cards = cards + ", 5";
                }
                else if (x == 6)
                {
                    sum = sum + x;
                    cards = cards + ", 6";
                }
                else if (x == 7)
                {
                    sum = sum + x;
                    cards = cards + ", 7";
                }
                else if (x == 8)
                {
                    sum = sum + x;
                    cards = cards + ", 8";
                }
                else if (x == 9)
                {
                    sum = sum + x;
                    cards = cards + ", 9";
                }
                else if ((x >= 10) && (x <= 12))
                {
                    sum = sum + 10;
                    if (x == 10)
                    {
                        cards = cards + ", King";
                    }
                    else if (x == 11)
                    {
                        cards = cards + ", Queen";
                    }
                    else if (x == 12)
                    {
                        cards = cards + ", Jack";
                    }
                }
                else if (x == 13)
                {
                    sum = sum + x - 2;
                    cards = cards + ", Ace";
                }
            }
            
            System.out.println("");
            
            
            //Dealer hits card
            if (dealerSum <= 14)
                {
                x = randomGen.nextInt(10 + 2);
                if (x == 2)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 2";
                }
                else if (x == 3)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 3";
                }
                else if (x == 4)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 4";
                }
                else if (x == 5)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 5";
                }
                else if (x == 6)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 6";
                }
                else if (x == 7)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 7";
                }
                else if (x == 8)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 8";
                }
                else if (x == 9)
                {
                    dealerSum = dealerSum + x;
                    dealerCards = dealerCards + ", 9";
                    }
                else if ((x >= 10) && (x <= 12))
                {
                    dealerSum = dealerSum + 10;
                    if (x == 10)
                    {
                        dealerCards = dealerCards + ", King";
                    }
                    else if (x == 11)
                    {
                        dealerCards = dealerCards + ", Queen";
                    }
                    else if (x == 12)
                    {
                        dealerCards = dealerCards + ", Jack";
                    }
                }
                else if (x == 13)
                {
                    dealerSum = dealerSum + x - 2;
                    dealerCards = dealerCards + ", Ace";
                }
            }

            System.out.println("");
            System.out.println("");
            
            if (stay == 2) //Stay
            {
                System.out.println("You have chosen to stay.");
                System.out.println("");
                System.out.println("");
                System.out.println("Your sum is >>> " + sum);
                System.out.println("The dealer's sum is " + dealerSum);
                if (dealerSum > sum)
                {
                    System.out.println("You have lost, better luck next time!");
                }
                else if (dealerSum < sum)
                {
                    System.out.println("You have won! Congratulations!");
                }
                else if (dealerSum == sum)
                {
                    System.out.println("You and the dealer have tied, good game!");
                }
                continu = false;
            }
            
            //Bust checker:
            if (sum >= 21)
            {
                System.out.println("Sorry, but you hit or tried to hit above 20. You have been busted.");
                System.out.println("Your sum is >>> " + sum);
                System.out.println("The dealer's sum is " + dealerSum);
                System.out.println("You have lost, better luck next time!");
                continu = false;
            }
            
        }
        
        
        System.out.println("Thank you for playing");
    }
}