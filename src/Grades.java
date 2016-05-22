import java.util.Scanner;

public class Grades {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int i;
		int total = 0;
		
		System.out.println("how many grades do you have to enter");
		String number = scanner.nextLine();
		int num = Integer.parseInt(number);

		for (i = 1; i <= num; i++) {

			System.out.println("Enter the marks for subject" + i);
			String input = scanner.nextLine();
			int score = Integer.parseInt(input);
			total = total + score;
		}
		int avg;
		String grade;
		avg = total / num;

		if (avg >= 90) {
			grade = "A Grade";
		} else if (avg >= 80) {
			grade = "B Grade";
		} else if (avg >= 65) {
			grade = "C Grade";
		} else if (avg >= 50) {
			grade = "D Grade";
		} else {
			grade = "F";
		}
		System.out.println("your grade is " + grade);

	}
}
