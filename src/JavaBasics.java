import java.util.Scanner;
public class JavaBasics 
{
	static Scanner scanner= new Scanner(System.in);
	
	public static void main (String[] args)
	{	
		System.out.println("enter a number to see if it is greater than 10");
		String a= scanner.nextLine();
		int b = Integer.parseInt(a);
		
	if(b>10)
	{
	System.out.println("the number is greater than 10");	
	}
	else if (b<10)
	{
		System.out.println("the number is less than 10");
	}
	else
	{
		System.out.println("the number is equal to 10");
	}	
		
	System.out.print("Good Job, lets move on to the next segment");

	}	
}
