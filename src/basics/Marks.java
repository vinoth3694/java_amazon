package basics;

public class Marks {
	public static void main(String[] args) {
		 
		
		int marks=45;
		
		
		if (marks> 90)
		{
			System.out.println("The student has secured Grade A");
			
		}
		else if(marks > 75)
		{
			System.out.println("The student has secured Grade B");
		}
		else if(marks>50)
		{
			System.out.println("The student has secured Grade C");
		}
		else
		{
			System.out.println("Marks doesn't come under any grade");
		}

}
}