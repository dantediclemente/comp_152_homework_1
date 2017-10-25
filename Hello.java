import java.util.Scanner;

public class Hello {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter your name"); //takes your name
		
		String name=sc.nextLine(); //stores your name
		
		System.out.println("Hello, "+name); //prints your name
		
		sc.close();
	}
}

//DONT PROMPT FOR THE USERS INPUT