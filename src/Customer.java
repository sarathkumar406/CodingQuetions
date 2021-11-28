import java.util.*;
class Customer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter gender:");
		String gender = sc.next();
		System.out.println("Enter from:");
		String from = sc.next();
		System.out.println();
		System.out.println("Welcome, "+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("City:"+from);
	}
}
