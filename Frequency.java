import java.util.Scanner;
public class Frequency   
{  
    public void fchar(String str,char character)
    {  
        int count = 0;
        for (int i=0; i<str.length();i++)
        {
            if(character == str.charAt(i))
            {
                count++;
            }
        }
        System.out.println("Frequency of the give character:: "+count);
    }
    public void Reverse(String str)
    {
        String rev="";
        int length=str.length();
        for (int i=length-1; i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed String is : "+rev);
    }
    public static void main(String args[])
    {
        Scanner imp = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = imp.nextLine();
        System.out.println("Enter a character whose Frequency is to found");
        char character = imp.nextLine().charAt(0);
        Frequency obj=new Frequency();
        obj.fchar(str,character);
        obj.Reverse(str);
    }
}  
