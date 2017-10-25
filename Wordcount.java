import java.util.Scanner;

public class Wordcount 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter keyword");
		
		String keyword = sc.nextLine(); //takes keyword 
		
		//System.out.println("Enter input");
		
		String inputLine = sc.nextLine(); //takes line of input
		
		String[] lineSplit = inputLine.split(" "); //changes input to array
		
		int keywordCount = 0;
		
		for(int n = 0; n < lineSplit.length; n++)
		{
			String word = lineSplit[n]; //changes array value to single string
			if ( keyword.equals(word)) //compares the keyword to string value
			{
				keywordCount += 1; //adds to the count of keywords if they are equal
			}
		}
		
		System.out.println(keywordCount);
		
		sc.close();
	}

}
