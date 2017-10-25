import java.util.Scanner;

public class Sum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		//System.out.println("Enter digits"); //takes digits
	
		String numbers=sc.nextLine();
		 
		 String[] split = numbers.split(" "); //splits string to array
		 
		 int[] numsSplit = new int[split.length]; //makes int array the length of the numbers
		 
		 for(int n = 0; n < split.length; n++) {
		        numsSplit[n] = Integer.parseInt(split[n]); //stores the numbers into the Int array
	}
		 int sum = 0;
		 
		 for (int i : numsSplit) { //adds all the numbers
			    sum += i;
	}
		System.out.println(sum); 
		
		sc.close();
	}
}