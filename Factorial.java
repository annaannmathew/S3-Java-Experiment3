import java.util.Scanner;
public class Factorial
{
    public void fact(int n)
    {
        int i,fact=1;
        System.out.println("Factorial is");
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println(fact);
        }
    }
    public void sumdigit(int n)
    {
        int d,sum=0;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("Sum of digits is "+sum);
    }
    public static void main(String args[])
    {
        int n;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the number");
        n=imp.nextInt();
        Factorial obj=new Factorial();
        obj.fact(n);
        obj.sumdigit(n);
    }
}