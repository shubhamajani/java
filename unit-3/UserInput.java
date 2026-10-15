import java.util.Scanner

class UserInput
{
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

	System.out.println("Enter your age: ");
       	int age = sc.nextLine();

	System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}

	













































import java.util.Scanner;

public class UserInputExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}