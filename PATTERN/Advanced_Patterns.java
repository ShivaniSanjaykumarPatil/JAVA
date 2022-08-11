public class Advanced_Patterns
{
    public static void main(String[] args)
    {
        System.out.print("\n \n 1 -> \n \n");
        pattern1(7);
        System.out.print("\n \n 2 -> \n \n");
        pattern2(7);
        System.out.print("\n \n 3 -> \n \n");
        pattern3(7);
        System.out.print("\n \n 4 -> \n \n");
        pattern4(7);
        System.out.print("\n \n 5 -> \n \n");
        pattern5(7);
        System.out.print("\n \n 6 -> \n \n");
        pattern6(7);
        System.out.print("\n \n 7 -> \n \n");
        pattern7(7);
        System.out.print("\n \n 8 -> \n \n");
        pattern8(5);
        System.out.print("\n \n 9 -> \n \n");
        pattern9(7);
        System.out.print("\n \n 10 -> \n \n");
        pattern10(7);
    }
    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==1 || row==n || col==1 || col==n)
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
    static void pattern2(int n)
    {
        for(int row=1; row<=(n+1)/2;row++)
        {
            for(int s=1;s<=((n+1)/2)-row;s++)
            {
                System.out.print("  ");
            }
            for(int col=1;col<=(2*row)-1;col++)
            {
                if(col==1 || row==(n+1)/2 || col==(2*row)-1)
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
    static void pattern3(int n)
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
                if(col==1 || col==column)
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
    static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int half=((n+1)/2);
            int column=(row<=half)?(half-row):(row-half);
            for(int col=1;col<=column;col++)
            {
                System.out.print("* ");
            }
            int space= (row<=half)?((row*2)-1):(((half-(row-half))*2)-1);
            for(int s=1;s<=space;s++)
            {
                System.out.print("  ");
            }
            for(int col=1;col<=((n-space)/2);col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int half=(n+1)/2;
            for(int col=1;col<=n;col++)
            {
                int a=((half-(row-half)));
                int p_row=(row<=half)?((half-row)+1):((row-half)+1);
                int p_col=(col<=half)?((half-col)+1):((col-half)+1);
                int num=(row<=half)?((col>=row && col<=n-row)?p_row:p_col):((col>=a && col<=n-a)?p_row:p_col);
                System.out.print(" "+num);
            }
            System.out.println();
        }
    }
    static void pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int half=(n+1)/2;
            int space=(row<half)?(half-row):(row-half);
            for(int s=1;s<=space;s++)
            {
                System.out.print("  ");
            }
            int column=(row<half)?((row*2)-1):(((half-(row-half))*2)-1);
            for(int col=1;col<=column;col++)
            {
                int num=(row<=half)?(row-col+1):((half-(row-half))-col+1);
                num=(num<1 && row<=half)?(col-row+1):(num);
                num=(num<1 && row>half)?(col-(half-(row-half))+1):(num);
                if(col==(column+1)/2)
                {
                    System.out.print(""+num+" ");
                }
                else
                {
                    System.out.print(""+num+" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int num=(row%2==0)?(0):(1);
            for(int col=1;col<=row;col++)
            {
                System.out.print(" "+num);
                num=(num==0)?(1):(0);
            }
            System.out.println();
        }
    }
    static void pattern8(int n)
    {
        int count=0;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                int num=(count%2==0)?(count+97):(count+65);
                char c=(char)num;
                System.out.print(" "+c);
                count++;
            }
            System.out.println();
        }
    }
    static void pattern9(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col==1 || col==n || col==row || col==(n-(row-1)))
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
    static void pattern10(int n)
    {
        for(int row=1;row<=(n+1)/2;row++)
        {
            for(int s=1;s<=((n+1/2)-row);s++)
            {
                System.out.print("  ");
            }
            for(int col=1;col<=(n+((row*2)-1));col++)
            {
                if(col==1 || col==((row*2)-1) || col==n || col==n+((row*2)-1)-1)
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
