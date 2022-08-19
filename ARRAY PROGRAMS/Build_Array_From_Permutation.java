import java.util.*;
public class Build_Array_From_Permutation
{
    public static void main(String[] args)
    {
        int[] nums={0,2,1,5,3,4};
        Array_Permutation(nums);
    }
    static void Array_Permutation(int[] arr)
    {
        int[] new_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            new_arr[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
