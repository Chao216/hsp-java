// we will use Scanner class

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in); //create a object by new one !

		System.out.println("please enter your name");

		String name1 = myScanner.nextLine(); // nextLine() will accept input with space, Next cannot take space input.

		System.out.println("what is your age ？");

		int age1 = myScanner.nextInt();

		System.out.println("what is your salary in K ?");

		double salary1 = myScanner.nextDouble();

		System.out.println("\nYour name is " + name1 + " and your age is " + age1 + " and your monthly pay is " + salary1 + ".");
	}
}
