import java.util.*;
public class Swap_elements_of_array
{
    public static void main(String[] args)
    {
        int[] arr={0,1,2,3,4,5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] num,int index1,int index2)
    {
        int temp=num[index1];
        num[index1]=num[index2];
        num[index2]=temp;
    }
}