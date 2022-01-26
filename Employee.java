import java.util.Scanner;
public class Employee 
{
    int empno;
    String name;
    double phnno;
    public void read() 
    {
        Scanner imp = new Scanner(System.in);
        System.out.print("Enter the employee id ");
        empno = imp.nextInt();
        System.out.print("Enter the name ");
        name = imp.next();
        System.out.print("Enter the phone number ");
        phnno = imp.nextDouble();
        System.out.println();
    }
     
    public void display() 
    {
        System.out.println("Employee id = " + empno);
        System.out.println("Employee name = " + name);
        System.out.println("Employee phone number = " + phnno);
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
     
        Employee e[] = new Employee[5];
        for(int i=0; i<5; i++) 
        {
            e[i] = new Employee();
            System.out.println("Enter the details of "+(i+1)+" employee\n");
            e[i].read();
        }
        System.out.println("Employee details\n");
        for(int i=0; i<5; i++) 
        {
            System.out.println("Details of "+(i+1)+" employee\n");
            e[i].display();
        }
    }
}