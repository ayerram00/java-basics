
import java.util.Scanner;
public class MonthName {
	static Scanner scanner = new Scanner (System.in);	
	private static Integer integer;
	
	public static void main(String[] args)
	{
		System.out.println("Enter a number between 1 and 12");
		String c= scanner.nextLine();
		
		int d= integer.parseInt(c);
		String month= "enter some thing between 1 and 12";
		
		switch(d)
		{
		case 1:
			month="january";
			break;
		case 2:
			month="Feb";
			break;
		case 3:
			month="Mar";
			break;
		case 4:
			month="Apr";
			break;
		case 5:
			month="May";
			break;
		case 6:
			month="June";
			break;
		case 7:
			month="July";
			break;
		case 8:
			month="August";
			break;
		case 9:
			month="Sep";
			break;
		case 10:
			month="Oct";
			break;
		case 11:
			month="Nov";
			break;
		case 12:
			month="Dec";
			break;
		
		}
	System.out.println("month is "+ month);	
		
	}
	
}
