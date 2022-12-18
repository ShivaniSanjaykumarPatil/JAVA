import java.util.*;
public class Reversing_Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>(10);
        for(int i=0;i<5;i++)
        {
            arr.add(sc.nextInt());
        }
        reverse(arr);
    }
    static void reverse(ArrayList<Integer> num)
    {
        for(int i=0;i<(num.size()/2);i++)
        {
            int j=num.size()-i-1;
            Collections.swap(num,i,j);
        }
        System.out.println(num);
    }
}