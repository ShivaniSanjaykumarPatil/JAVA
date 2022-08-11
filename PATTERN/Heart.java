public class Heart
{
    public static void main(String[] args)
    {
        System.out.print("\n \n 1 -> \n \n");
        pattern1(12);
    }
    
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int a=((n+1)/2);
            int space=(row<=a)?(a-row):(row-a);
            for(int s=1;s<=space;s++)
            {
                System.out.print("  ");
                
            }
            int column=(row<=a)?((row*2)-1):(((a-(row-a))*2)-1);
            for(int col=1;col<=column;col++)
            {
                if((col==4-1 && row<=a-1 && row>=4)||(col==column-2 && row<=a-1 && row>=4) || (row==((n+1)/2)-1 && col==((n+1)/2)-1) ||(col==4 && row>=a && row<= n-4) || (col==column-3 && row>=a && row<= n-4) || col==1 || col==column)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
