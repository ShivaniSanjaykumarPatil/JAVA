public class Pattern_Program 
{
    public static void main(String[] args) 
    {
         System.out.print("\n \n 1 -> \n \n");
        pattern1(4);
        System.out.print("\n \n 2 -> \n \n");
        pattern2(4);
        System.out.print("\n \n 3 -> \n \n");
        pattern3(7);
        System.out.print("\n \n 4 -> \n \n");
        pattern4(4);
        System.out.print("\n \n 5 -> \n \n");
        pattern5(4);
        System.out.print("\n \n 6 -> \n \n");
        pattern6(4);
        System.out.print("\n \n 7 -> \n \n");
        pattern7(7);
        System.out.print("\n \n 8 -> \n \n");
        pattern8(7);
        System.out.print("\n \n 9 -> \n \n");
        pattern9(7);
        System.out.print("\n \n 10 -> \n \n");
        pattern10(7);
        System.out.print("\n \n 11 -> \n \n");
        pattern11(7);
    }
static void pattern1(int n)
{
   for (int row=1;row<=n;row++) 
   {
       for (int col=1;col<=row;col++)
       {
           System.out.print("* ");
       }
       System.out.println();
   }
}


static void pattern2(int n)
{
    for (int row=1;row<=n;row++) 
   {
       for (int col=1;col<=n-row+1;col++)
       {
           System.out.print("* ");
       }
       System.out.println();
   }
}   
   
static void pattern3(int n)
{
   for (int row=1;row<=n;row++) 
   {
       int max=n%2==0?n/2:(n/2)+1;
       int space=row<=max?max-row:row-max;
       for (int s=1;s<=space;s++)
       {
           System.out.print("  ");
       }
       int column=row<=max?row:max-(row-max);
       for (int col=1;col<=column;col++)
       {
           System.out.print("* ");
       }
       System.out.println();
   }
}

static void pattern4(int n)
{
    for(int row=1; row<=2*n-1 ; row++)
    {
        int column= row <= n ? row : n-(row-n);
        for(int col=1; col<=column ;col++)
        {
           System.out.print("* "); 
        }
        System.out.println();
    }
    
}

static void pattern5(int n)
{
    for(int row=1; row<=n ;row++)
    {
        int space=n-row;
        for(int s=1;s<=space;s++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<=row;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern6(int n)
{
    for(int row=1;row<=n;row++)
    {
        int space=row-1;
        for(int s=1;s<=space ;s++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<=n+1-row;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern7(int n)
{
    for(int row=1;row<=1+n/2;row++)
    {
        int space =(1+(n/2))-row ;
        for(int s=1;s<=space;s++)
        {
            System.out.print("  ");
        }
        for(int col=1;col<2*row;col++)
        {
            System.out.print("* ");
        }
        
        System.out.println();
    }
}

static void pattern8(int n)
{
    for(int row=1;row<=(n/2)+1;row++)
    {
        for(int s=1; s<row ;s++)
        {
            System.out.print("  ");
        }
        double column=7-(2*(row-1));
        for(int col=1;col<=column;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern9(int n)
{
    for(int row=1;row<=n;row++)
    {
        int max= (n%2)==0?(n/2):((n/2)+1);
        int space=row<=max?(max-row):row-max;
        for(int s=1;s<=space;s++)
        {
            System.out.print("  ");
        }
        int column=3;
        for(int col=1;col<=column;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern10(int n)
{
    for(int row=1;row<=n;row++)
    {
        int max= (n%2)==0?(n/2):((n/2)+1);
        int space=row<=max?(max-row):row-max;
        for(int s=1;s<=space;s++)
        {
            System.out.print("  ");
        }
        int column= row<=max?(2*row-1):n-((row-max)*2);
        for(int col=1;col<=column;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern11(int n)
{
    for(int row=1; row<=n ;row++)
    {
        int max=n/2==0?n/2:(n/2)+1;
        int space=row<=max?row-1:n-row;
        for(int s=1;s<=space;s++)
        {
            System.out.print("  ");
        }
        int column=row<=max?n-((row-1)*2):n-((n-row)*2);
        for(int col=1;col<=column;col++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
