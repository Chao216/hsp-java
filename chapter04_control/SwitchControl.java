// here is switch control

import java.util.Scanner;

public class SwitchControl {
	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);

		System.out.println("please enter a number between 1 and 7 to indicate day of the week");

		int day = myScan.nextInt();

		switch (day) {

		case 1:
			System.out.println("Happy Monday !");
			break;
		case 2:
			System.out.println("Happy Tuesday !");
			break;
		case 3:
			System.out.println("Happy Wednesday !");
			break;
		case 4:
			System.out.println("Happy Thursday !");
			break;
		case 5:
			System.out.println("Happy Friday !");
			break;
		case 6:
			System.out.println("Happy Saturday !");
			break;
		case 7:
			System.out.println("Happy Sunday !");
			break;
		default:
			System.out.println("Have a nice day !");

		}
		
	}
}