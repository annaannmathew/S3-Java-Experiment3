import java.util.Scanner;
class Perimeter
{
    public static void main(String arg[])
    {
        double length,breadth,radius;
        Scanner imp=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        length=imp.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        breadth=imp.nextDouble();
        System.out.println("Enter the radius of the circle");
        radius=imp.nextDouble();
        Shapes obj = new Shapes(length,breadth);
        obj=new Shapes(radius);
    }
}

class Shapes
{
    Shapes(double length,double breadth)
    {
        double perimeter= 2 * (length + breadth);
        System.out.println("\nLength = " +length);
        System.out.println("Breadth = " +breadth);
        System.out.println("Perimeter = " + perimeter);
    }
    Shapes(double radius)
    {
        double p = 2*3.14* radius;
        System.out.println("Radius = " +radius);
        System.out.println("Perimeter = " + p);
    }
}
