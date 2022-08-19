import java.util.*;
import java.math.*;
public class Basic_Calculations
{
    public static void main(String[] args)
    {
        System.out.println("1. Calsius_to_Fahrenheit\n2. Maximum_Minimum\n3. Check_Case\n4. Sum_of_Digits_in_a_Numbers\n5. Reverse_Number\n6. Palendrome\n7. Armstrong_Number\n8. Fibonacci_Series\n 9. Factorial\n 10. Prime\n 11. HCF_LCM");
        System.out.print("Enter your choice : ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1 -> Calsius_to_Fahrenheit();
            case 2 -> Maximum_Minimum();
            case 3 -> Check_Case();
            case 4 -> Sum_of_Digits_in_a_Numbers();
            case 5 -> Reverse_Number();
            case 6 -> Palendrome();
            case 7 -> Armstrong_Number();
            case 8 -> Fibonacci_Series();
            case 9 -> Factorial();
            case 10 -> Prime();
            case 11 -> HCF_LCM();
            default -> System.out.println("Invalid!!!");
        }
    }
    static void Calsius_to_Fahrenheit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the temprature in Calsius : ");
        float calsious=sc.nextInt();
        double fahrenheit=(calsious*1.8)+32;
        System.out.println("Calsious : "+calsious+"\t Fahrenheit : "+fahrenheit);
    }
    static void Maximum_Minimum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 Numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        System.out.println("Maximum : "+Math.max(Math.max(num1,num2),num3));
        System.out.println("Minimum : "+Math.min(Math.min(num1,num2),num3));
    }
    static void Check_Case()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=sc.next().trim().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.print(ch+"is capital case character : ");
        }
        else if(ch>='a' && ch<='z')
        {
            System.out.print(ch+" is small case character : ");
        }
        else
        {
            System.out.print("Not a character : ");
        }
    }
    static void Sum_of_Digits_in_a_Numbers()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            sum=sum+(num%10);
            num=num/10;
        }
        System.out.print("Sum_of_Digits_in_a_Numbers : "+sum);
    }
    static void Reverse_Number()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int new_num=0;
        while(num!=0)
        {
            new_num=new_num*10+(num%10);
            num=num/10;
        }
        System.out.print("Reverse_Number : "+new_num);
    }
    static void Palendrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int origina_num=num;
        int new_num=0;
        while(num!=0)
        {
            new_num=new_num*10+(num%10);
            num=num/10;
        }
        System.out.print(origina_num+" "+((origina_num==new_num)?"is Palendrome":"is NOT a Palendrome"));
    }
    static void Armstrong_Number()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int origina_num=num;
        double new_num=0;
        while(num!=0)
        {
            new_num=new_num+Math.pow((num%10),3);
            num=num/10;
        }
        System.out.print(origina_num+" "+((origina_num==new_num)?"is Armstrong_Number":"is NOT an Armstrong_Number"));
    }
    static void Fibonacci_Series()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int sum,num1=0;
        int num2=1;
        System.out.print(""+num1);
        System.out.print(" "+num2);
        for(int i=3;i<=num;i++)
        {
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.print(" "+sum);
        }
    }
    static void Factorial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.print("Factorial of " +num+ " is : "+factorial);
    }
    static void Prime()
    {
        // find weather a number is prime or not 
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        int flag=0;
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        System.out.print(num+" "+((flag==0)?"is Prime_Number":"is NOT an Prime_Number"));

    }
    static void HCF_LCM()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two Numbers : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int HCF=0;
        int LCM=0;
        for(int i=1;i<=(Math.min(num1,num2));i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                HCF=i;
            }
        }
        LCM=(num1*num2)/HCF;
        System.out.print("HCF : "+HCF+"\t LCM : "+LCM);
    }
}
