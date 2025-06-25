//Problem-3: With a single integer as the input, generate the series of numbers as shown in below examples.

import java.util.Scanner;
public class OddSeriesGenerator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int result =0;

		System.out.println(" Enter  integer as input ");
		int  num = scanner.nextInt();
		
		int oddOrEven = (num % 2 != 0) ? num : num -1;

		for(int i=1; i<(oddOrEven*2); i++)
		{
			if(i % 2 != 0)
			{
				System.out.print( i + ", " );
			}
		}
		scanner.close();
	}
}
			
