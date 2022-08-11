public class NumberPatterns
{
    public static void main(String[] args)
    {
       System.out.println("\n\n Pattern 1. \n");
       pattern1(7);
       System.out.println("\n\n Pattern 2. \n");
       pattern2(7);
       System.out.println("\n\n Pattern 3. \n");
       pattern3(7);
       System.out.println("\n\n Pattern 4. \n");
       pattern4(7);
       System.out.println("\n\n Pattern 5. \n");
       pattern5(7);
    }
    static void pattern1(int n)
    {
     for(int row=1;row<=n;row++)
     {
        for(int col=1;col<=row;col++)
        {
            System.out.print(""+row);
        }
        System.out.println();
     }
    }
    
    static void pattern2(int n)
    {
     for(int row=1;row<=n;row++)
     {
        for(int s=1;s<=n-row;s++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print(""+(char)(col+64));
        }
        System.out.println();
     }
    }
    
    static void pattern3(int n)
    {
     for(int row=1;row<=n;row++)
     {
        for(int s=1;s<=row-1;s++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=n+1-row;col++)
        {
            System.out.print(""+col);
        }
        System.out.println();
     }
    }
    static void pattern4(int n)
    {
     for(int row=1;row<=n;row++)
     {
        int count=0;
        for(int s=1;s<=row-1;s++)
        {
            System.out.print(" ");
        }
        
        for(int col=1;col<=n+1-row;col++)
        {
            if(count==0)
            {
                System.out.print(""+col);
            }
            else
            {
                System.out.print(" "+col);
            }
            count++;
        }
        System.out.println();
     }
    }
    static void pattern5(int n)
    {
     for(int row=1;row<=n;row++)
     {
        for(int s=1;s<=n-row;s++)
        {
            System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print(""+(n+1-col)+" ");
        }
        System.out.println();
     }
    }
}
