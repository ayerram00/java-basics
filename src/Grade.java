import java.util.Scanner;
public class Grade {
	//static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter your score in %(percentage)");
		Scanner scanner=new Scanner(System.in);
		String a= scanner.nextLine();
		int b = Integer.parseInt(a); 
		String grade="A grade";
		if ((b<=100)&&(b>= 90))
			{
			grade= "A Grade";
			}
		else if((b<=89) && (b >=80))
			{
			grade= "B Grade";
			}
		else if((b<=79) && (b>=65))
			{
			grade= "C Grade";
			}
		else if((b<=64) && (b>=50))
		{
		grade= "D Grade";
		}
		else
		{
			grade="F";
		}
		System.out.println("your grade is "+ grade);
		
		
	}
	
}
