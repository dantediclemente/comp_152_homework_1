import java.util.Scanner;

public class Factors 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		int number=sc.nextInt(); //takes number
		
		for(int n=1; n <= number; n++)  //loops through to see if the number is a factor
		{
			if(number % n == 0)
			{
				System.out.println(n); //prints the number if it is a factor
			}
		}
		sc.close();
	}
}
