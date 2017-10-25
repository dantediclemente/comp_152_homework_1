import java.util.Scanner;

public class SpeedCamera 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int carone = 0;
		int cartwo = 0;
		
		for (int i = 0; i<5; i++)
		{
			String firstLine = sc.nextLine();				
			char line = firstLine.charAt(1); //finds car
			if (line == 'c') 
			{
				carone = i;
			} 
		}
		
		for (int i = 0; i<5; i++)
		{
			String firstLine = sc.nextLine();
			char line = firstLine.charAt(1); //finds car
			if (line == 'c') 
			{
				cartwo = i;
			} 
		}	
		
		int dist = carone - cartwo + 1; //finds distance
		
		int frac = dist * 3600 / 200; //converts to seconds per hour and divides by the mile
		
		int ticket = 10 * (frac - 30); //subtracts 30 mph then calculates fine 
		
		System.out.println("$"+ticket); //prints fine
		
		sc.close();
	}
}
