import java.util.*;
public class Concatenation_of_Array
{
    public static void main(String[] args)
    {
        int[] nums={0,2,1,5,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) 
    {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<ans.length;i++)
        {
            if(i>=nums.length)
                ans[i]=nums[i-nums.length];
            else
                ans[i]=nums[i];
        }
        return ans;
    }
}

// optimized solution

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int n=nums.length;
        int[] ans=new int[n*2];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}

