import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter digits"); //takes digits
	
		String numbers=sc.nextLine();
		 
		 String[] split = numbers.split(" "); //splits string to array
		 
		 int[] nums_split = new int[split.length]; //makes int array the length of the numbers
		 
		 for(int n = 0; n < split.length; n++) {
		        nums_split[n] = Integer.parseInt(split[n]); //stores the numbers into the Int array
		 }
		 
		 int one = nums_split[0]; 
		 							//turns numbers into variables
		 int two = nums_split[1];
		 
		 int greatest = 0;
		 
		 for (int i = 1; i <= one && i <= two; i++) //adds 1 to the variable i until it reaches the first number
		 {
			 if(one % i == 0 && two % i == 0) //checks if the number divides into both and makes it the GCD if it does
				 greatest = i;
		 }
		 
		 System.out.println(greatest); //prints the GCD
		 
		 sc.close();
	}
	
}
