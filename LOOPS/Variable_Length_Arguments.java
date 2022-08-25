import java.util.*;
public class Variable_Length_Arguments
{
    public static void main(String[] args)
    {
        demoFunction();
        demoFunction(1,2,3);
        int[] nums={1,2,3,4};
        demoFunction(nums);
    }
    static void demoFunction(int ...a)
    {
        System.out.println(Arrays.toString(a));
    }
}
