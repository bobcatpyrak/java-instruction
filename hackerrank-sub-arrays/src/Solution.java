import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        kb.nextLine();
        int[] nums = new int[length];
        String ns = kb.nextLine();
        String[] nsSplit = ns.split(" ");
        for (int i = 0; i < length; i++)
        {
            nums[i] = Integer.parseInt(nsSplit[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int size = 0;
        for (int i = length; i > 0; i--)
            size += i;
        
        //System.out.println(size);

        int[] sums = new int[size];
        int index = 0;

        // populate sums by iterating through the array
        for (int i = 1; i < length + 1; i++) //size of subarrays
        {
            //System.out.println("Size of subarray: " + i);

            for (int k = 0; k < length - i + 1; k++) //iterate through array
            {
                //System.out.println("Beginning num to add: " + nums[k]);
                for (int j = 0; j < i; j++) //iterate through subarray
                {
                    //System.out.println("Adding to subarray: " + nums[j+k]);
                    sums[index] += nums[j+k];
                }
                //System.out.println("Sum of subarray: " + sums[index]);
                index++;
            }

        }

        int totalNegatives = 0;

        for(int i : sums)
        {
            if(i < 0)
                totalNegatives++;
        }

        System.out.println(totalNegatives);


        
    }
}
