import java.util.*;
class Shuffle_the_Array
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(shuffle(nums,3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i+=2)
        {
            arr[i]=nums[j];
            j++;
            arr[i+1]=nums[n];
            n++;
        }
        return arr;
    }
}