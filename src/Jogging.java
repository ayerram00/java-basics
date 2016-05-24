import java.util.*;

public class Jogging {
	public static void main(String[] args) {
		System.out.println("Welcome to the application \n What is your registered Jogging name");
		String name;
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		int day = 0;

	
		do
			{
			try {
				System.out.println("So how many days(enter 1-7) did you go Jogging this week " + name + "?");	
				String daystring = scanner.nextLine();
				day=Integer.parseInt(daystring);
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number.");
			}
			} while((day < 1) || (day > 7));
	
						
		int i;
		int total = 0;
		for(i=1;i<=day;i++)
		{
			System.out.println("How many hours did you jog on Day"+ i +" "+name);
			String hourstring;
			hourstring=scanner.nextLine();
			int hours=Integer.parseInt(hourstring);
			total=total+hours;
		}
	int avg;
	avg=total/day;
		System.out.print("Hi "+name +", You jogged a total of "+ total+" hours which is about "+avg+" hours a day");

		//Comparing the logged in hours
		
		String joggertype;
		if (total <=15)
		{
			joggertype="Amateur Jogger";
		}
		else if (total <=40)
		{
			joggertype="Effecient Jogger";
		}
		else 
		{
			joggertype="Extremist Jogger";
		}
		System.out.println(", you are an "+ joggertype);
		
		
	}

}
