//Name: (TJ) Thejaswin Kumaran -Centennial HS
//Period: 3B

import java.util.*;
public class BinaryConversion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        ///#1
        int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};
        
        ///#2
        double num = 0;
        for (int i = 0; i < nums.length; i ++)
        {
            num = num + nums[i];
        }
        System.out.println("The sum of the array is >>> " + num);
        
        ///#3
        boolean bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if ((nums[i] % 2) == 1)
            {
                bool = true;
            }
        }
        if (bool)
        {
            System.out.println("Found a odd");
        }
        
        ///#4
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] == 0)
            {
                bool = true;
            }
        }
        if (bool)
        {
            System.out.println("Found a zero");
        }
        else
        {
            System.out.println("No zeros");
        }
        
        ///#5
        //24 mph
        
        ///#6
        bool = false;
        boolean bool2 = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] == 6)
            {
                bool = true;
            }
        }
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] == 6)
            {
                bool2 = true;
            }
        }
        if (bool && bool2)
        {
            System.out.println("Two 6s");
        }
        else
        {
            System.out.println("Less than 2 6s");
        }
        
        
        ///#7
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] == 2)
            {
                if (nums[i + 1] == 3)
                {
                    bool = true;
                }
            }
        }
        if (bool)
        {
            System.out.println("Found 2/3");
        }
        else
        {
            System.out.println("no 2/3");
        }
        
        ///#8
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if ((nums[i] == nums[i + 1]) || (nums[i] < nums[i + 1]))
            {
                if (nums[i + 1] == 3)
                {
                    bool = true;
                }
            }
        }
        if (bool)
        {
            System.out.println("Found 2/3");
        }
        else
        {
            System.out.println("no 2/3");
        }
        
        ///#9
        num = 0;
        for (int i = 0; i < nums.length; i ++)
        {
            if ((nums[i] % 2) == 0)
            {
                num ++;
            }
        }
        if ((num % 2) == 0)
        {
            System.out.println("Even evens");
        }
        else
        {
            System.out.println("Uneven evens");
        }
        
        ///#10
        bool = false;
        for (int i = 0; i < nums.length; i ++)
        {
            if ((nums[i] == nums[i + 1]) && (nums[i] == nums[i + 2]))
            {
                bool = true;
            }
        }
        if (bool)
        {
            System.out.println("Three in a row");
        }
        else
        {
            System.out.println("No three in a row");
        }
        
        ///#11
        num = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] > num)
            {
                num = nums[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i ++)
        {
            if (nums[i] < num2)
            {
                num2 = nums[i];
            }
        }
        System.out.println(num - num2);
        
        
        
        ///#Binary conversion app
        System.out.println("Enter a binary number >>> ");
        String strBinary = console.next();
        num = 0;
        String a = "0";
        int [] binary = new int[8];
        for (int i = 0; i < nums.length; i ++)
        {
            a = ((strBinary.substring( (strBinary.length() - (1 + i)) , (strBinary.length() - i) )));
            if (a.equals("1"))
            {
                num = num + Math.round(Math.pow( 2 , i ));
            }
        }
    }
}
