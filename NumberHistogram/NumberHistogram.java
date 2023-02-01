//Name: (TJ) Thejaswin Kumaran -Centennial High School
//Period: 3B

import java.util.*;
public class NumberHistogram
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        int [] nums = {2, 4, 5, 8, 13, 2, 3, 5, 9, 0, 9, 12, 6};
        
        ///#2
        System.out.println("#2 The first number in the array is >>> " + nums[0]);
        System.out.println("");
        
        ///#3
        System.out.println("#3 The second number in the array is >>> " + nums[1]);
        System.out.println("");
        
        ///#4
        System.out.println("#4 The fourth number in the array is >>> " + nums[3]);
        System.out.println("");
        
        ///#5
        System.out.println("#5 The last number in the array is >>> " + nums[12]);
        System.out.println("");
        
        ///#6
        System.out.println("#6 The length of the array is >>> " + nums.length);
        System.out.println("");
        
        ///#7
        System.out.println("#7 The last number in the array is >>> " + nums[nums.length - 1]);
        System.out.println("");
        
        ///#8
        //If 9 isn't one of the numbers, you could have 1, 2, 8 and 7 on one side while having 3, 4, 6 and 5
        
        ///#9
        System.out.println("#9");
        for (int i = 0; i < nums.length; i ++)
        {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
        
        ///#10
        System.out.println("#10");
        if ( (nums[0] == 6) || (nums[1] == 6) || (nums[2] == 6) || (nums[3] == 6) || (nums[4] == 6) || (nums[5] == 6))
        {
            System.out.println("Found a 6");
        }
        else
        {
            System.out.println("No 6 has been found");
        }
        System.out.println("");
        
        ///#11
        System.out.println("#11");
        boolean bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] >= 10)
            {
                bool = true;
            }
        }
        if (bool == true)
        {
            System.out.println("There are numbers in the array that are greater than 10");
        }
        else
        {
            System.out.println("There are no number in the array that are greater than 10");
        }
        System.out.println("");
        
        ///#12
        System.out.println("#12");
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] == 6)
            {
                bool = true;
            }
        }
        if (bool == true)
        {
            System.out.println("There is a 6 in the array");
        }
        else
        {
            System.out.println("There is no 6 in the array");
        }
        System.out.println("");
        
        ///#13
        System.out.println("#13");
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if ((2 <= nums[i]) && (nums[i] <= 8))
            {
                bool = true;
            }
        }
        if (bool == true)
        {
            System.out.println("Within 2 to 8");
        }
        else
        {
            System.out.println("Not within 2 to 8");
        }
        System.out.println("");
        System.out.println("");
        
        //Number Histogram
        
        //Generating numbers
        Random randomGen = new Random();
        int[] data = new int[25];
        for (int i = 0; i < 25; i ++)
        {
            data[i] = randomGen.nextInt(10);
        }
        int[] histogram = new int[10];
        
        //Sorting
        for (int i = 0; i < 25; i ++)
        {
            if (data[i] == 0)
            {
                histogram[0] ++;
            }
            if (data[i] == 1)
            {
                histogram[1] ++;
            }
            if (data[i] == 2)
            {
                histogram[2] ++;
            }
            if (data[i] == 3)
            {
                histogram[3] ++;
            }
            if (data[i] == 4)
            {
                histogram[4] ++;
            }
            if (data[i] == 5)
            {
                histogram[5] ++;
            }
            if (data[i] == 6)
            {
                histogram[6] ++;
            }
            if (data[i] == 7)
            {
                histogram[7] ++;
            }
            if (data[i] == 8)
            {
                histogram[8] ++;
            }
            if (data[i] == 9)
            {
                histogram[9] ++;
            }
        }
        
        //Output
        System.out.println("0 - occured " + histogram[0] + " times");
        System.out.println("1 - occured " + histogram[1] + " times");
        System.out.println("2 - occured " + histogram[2] + " times");
        System.out.println("3 - occured " + histogram[3] + " times");
        System.out.println("4 - occured " + histogram[4] + " times");
        System.out.println("5 - occured " + histogram[5] + " times");
        System.out.println("6 - occured " + histogram[6] + " times");
        System.out.println("7 - occured " + histogram[7] + " times");
        System.out.println("8 - occured " + histogram[8] + " times");
        System.out.println("9 - occured " + histogram[9] + " times");
        
    }
}