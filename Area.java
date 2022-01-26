import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        double r,l,b,p,q,s;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=imp.nextDouble();
        System.out.println("Enter length of a Rectangle");
        l=imp.nextDouble();
        System.out.println("Enter breadth of a Rectangle");
        b=imp.nextDouble();
        System.out.println("Enter the first side of a triangle");
        p=imp.nextDouble();
        System.out.println("Enter the second side of a triangle");
        q=imp.nextDouble();
        System.out.println("Enter the third side of a triangle");
        s=imp.nextDouble();
        Shapes obj= new Shapes();
        obj.Area(r);
        obj.Area(l,b);
        obj.Area(p,q,s);
    }
}
class Shapes 
{
    void Area(double a,double b,double c)
    {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "\n Area of triangle with lenght of sides  "+a+"," +b+ " and " +c+" is : "+ triarea);
    }

    void Area(double r)
    {
        double A = 3.14 * r * r;
        System.out.println("The area of the circle is :" + A);
    }
    
    void Area(double l, double b)
    {
        System.out.println("Area of the rectangle: " + l * b);
    }
}