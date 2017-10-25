import java.util.Scanner;

public class TreasureChest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int total = 0;
		
		int x = 0;
		 
		 while(x < 5) { //loops through the lines of code
			String lineOfInput = sc.nextLine(); 

			String[] split = lineOfInput.split(""); //splits the input into an array
		 
			for(int n = 0; n < lineOfInput.length(); n++) //loops through characters in array to add input
				{
					if(split[n].equals("@"))  //adds the right amount of money for each character 
					{
						total += 1000;
					} else if (split[n].equals("*")) {
						total += 300;
					} else if (split[n].equals("$")) {
						total += 500;
					}
				}
			x += 1; 
		 }
		 System.out.println("$"+total); //prints total
		 sc.close();
	}
}
