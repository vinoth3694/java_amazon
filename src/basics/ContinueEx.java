package basics;

public class ContinueEx {
	
	//continue statement will skip the current iteration and proceed to the next iteration based on the condition

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1; i<=10;i++)
		{
			
			if (i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
