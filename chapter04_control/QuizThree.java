import java.util.Scanner;

public class QuizThree {
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);

		System.out.println("plesae enter the year in integer number");

		int year = myscan.nextInt();

		if (year % 4 == 0 && year % 100 != 0){
			System.out.println("regular leap year");
		} else if (year % 400 == 0) {
			System.out.println("super leap year");
		} else {
			System.out.println("I am afraid it is just a regular normal year");
		}
	}
}