import java.util.Scanner;

public class Roaches 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt(); //takes number
		
		int num = 0;
		
		for(int n = 0; n <= 9; n++)
		{
			if (n < 2)
			{
				number = number * 2; //doubles roaches
			} else {
				num = number - 50; //kills 50 roaches
				number = num * 2; //doubles the roaches after they are killed
			}
		}
		System.out.println(number);
		
		sc.close();
	}
}
