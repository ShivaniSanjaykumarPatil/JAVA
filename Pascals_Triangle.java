public class Pascals_Triangle
{
    public static void main(String[] args)
    {
        System.out.println("\n\n Pascals_Triangle 6. \n");
        pattern(5);
    }
    static void pattern(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int count=1;
            for(int s=1;s<=n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print(""+count+" ");
                count=count*(row-col)/col;
            }
            System.out.println();
        }
    }
}
