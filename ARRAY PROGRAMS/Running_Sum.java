import java.util.*;
class Running_Sum
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) 
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}