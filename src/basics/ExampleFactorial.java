package basics;

public class ExampleFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input for the program
		int factorialNumber=35;
		
		long factResult=1;
		
		for(int i=1; i<=factorialNumber;i++)
		{
			factResult= factResult*i;
			
			//factResult=1
			//factResult=1*2=2
			//factResult=2*3=6
			//factResult=6*4=24
			//factResult=24*5=120
		}
		System.out.println("The factorial value for the given number is "+factResult);
		

	}

}
