import java.util.Scanner;

public class Average {
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
		 int sum = 0;
		 
		 for (int i : nums_split) { //adds all the numbers
			    sum += i;
	}
		 int av = (sum/nums_split.length); //averages the sum
		 
		System.out.println(av); 
		
		sc.close();
	}
}