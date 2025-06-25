import java.util.Scanner;
public class OddSeriesGenerator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int result =0;
        
		System.out.println(" Enter  integer as input ");
		int  num = scanner.nextInt();

		for(int i=1; i<(num*2); i++)
		{
			if(i % 2 != 0)
			{
				System.out.print( i + ", " );
			}
		}
		
	}
}
			
