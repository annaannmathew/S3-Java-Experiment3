import java.util.Scanner;
public class Student
{  
    String name;
    int rollno;
    int mark[]= new int[5];
    void read()
    {
        
        Scanner imp =new Scanner(System.in);
        System.out.println("Enter name");
        name=imp.nextLine();
        System.out.println("Enter rollno");
        rollno=imp.nextInt();
        System.out.println("Enter the marks");
        for(int i=0;i<5;i++)
        {
            mark[i]=imp.nextInt();
        }
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Rollno is "+rollno);
        System.out.println("Marks are ");
        for(int i=0;i<5;i++)
        {
            System.out.println(mark[i]);
        }
    }
    public static void main(String args[]) 
	{
	    Student obj=new Student();
	    obj.read();
	    obj.display();
	}
}