import java.util.*;
class Kids_With_the_Greatest_Number_of_Candies
{
    public static void main(String[] args)
    {
        int extraCandies=3;
        int[] arr={4,1,5,1,3};
        System.out.println(kidsWithCandies(arr,extraCandies));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int sum=0;
        for(int i=0;i<candies.length;i++)
        {
            if(sum<candies[i])
                sum=candies[i];
        }
        List<Boolean> li=new ArrayList<>(10);
        for(int i=0;i<candies.length;i++)
        {
            li.add((sum<=(candies[i]+extraCandies))? true : false);
        }
        return li;
    }
}