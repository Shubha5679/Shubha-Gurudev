
import java.util.Scanner;

class Calculator {

	public double addition(double num1, double num2)
	{
		return num1  +  num2;
	}

	public double subtraction(double num1, double num2)
	{
		return num1 - num2;
	}

	public double multiplication(double num1, double num2)
	{
		return num1 * num2;
	}

	public double division(double num1, double num2)  
	{
		if(num2 == 0)
		{
			System.out.println(" Error: Cannot divide by zero! " + " \n " + " num2 cannot be zero ");
			return 0;
		}
		return num1/ num2;
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Calculator calculate = new Calculator();
		
		double result = 0;
        
        while(true)
        {
    		  System.out.println(" Enter the first number: ");
    		  double num1 = scanner.nextDouble();
    
    		  System.out.println(" Enter the second number: ");
    		  double num2 = scanner.nextDouble();
    
    		  System.out.println(" Enter the operator  ( + , - , * , / ) :  ");
    		  char  operator  = scanner.next().charAt(0);
            
    		  switch(operator)
    		  {
    			  case '+' : 
    			  	result = calculate.addition(num1, num2);
    				  break;
    			  case '-' :
    				  result = calculate.subtraction(num1, num2);
    				  break;
    			  case '*' : 
    				  result = calculate.multiplication(num1, num2);
    				  break; 
    			  case '/' : 
    				  result = calculate.division(num1, num2);
    				  break;
    			  default:
    				  System.out.println(" Invalid operator! ");
    				  return;
    		  }
    
    		  System.out.println( num1  +  "  "  + operator + "  "  +  num2  +  "   "  +  " ="   + "  " + result + " \n ");
        }
	}
}



