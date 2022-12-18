import java.util.*;
public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>(10);
        for(int i=0;i<5;i++)
        {
            arr.add(sc.nextInt());
        }
        Maximum(arr);
    }
    static void Maximum(ArrayList<Integer> num)
    {
        int max=(num.get(0));
        for(int i=0;i<num.size();i++)
        {
            if(max < num.get(i))
            {
                max=num.get(i);
            }
        }
        System.out.println("Max element in the array is : "+max);
    }
}