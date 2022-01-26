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
        Rectangle rect = new Rectangle(length,breadth);
        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Perimeter = " + rect.getPerimeter());
        Circle cir = new Circle(radius);
        System.out.println("Radius = " +cir.radius);
        System.out.println("Perimeter = " + cir.getPerimeter());
    }
}

class Rectangle
{
    double length;
    double breadth;

    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    double getPerimeter() 
    {
        return 2 * (length + breadth);
    }
}
class Circle
{
    double radius;
    
    Circle(double radius)
    {
        this.radius = radius;
    }
    double getPerimeter() 
    {
        double p = 2*3.14* radius;
        return p;
    }
}