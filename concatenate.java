import java.util.Scanner;
public class concatenate 
{
    void Conc(String str1,String str2)
    {
        String str3=str1.concat(str2);
        System.out.println("Concatenated String is:"+str3);
    }
 
    void Conc(int a,int b)
    {
        System.out.println("Concatenated number is:"+a+b);
    }
    public static void main(String args[])
    {
        int m,n;
        Scanner imp=new Scanner(System.in);
        concatenate c=new concatenate();
        System.out.println("Enter 1st string:");
        String str1=imp.nextLine();
        System.out.println("Enter 2nd string:");
        String str2=imp.nextLine();
        c.Conc(str1,str2);
        System.out.println("Enter 1st number:");
        m=imp.nextInt();
        System.out.println("Enter 2nd number:");
        n=imp.nextInt();
        c.Conc(m,n);
    }
}