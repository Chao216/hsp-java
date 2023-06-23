// use inf control with input

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("please enter your age as an integer.");

		int age = myScanner.nextInt(); // take input as a age

		if (age < 18) {
			System.out.println("go back to school");
		} else if (age >= 18 && age <= 65) {
			System.out.println("hard working for your family");

		} else if (age > 65) {
			System.out.println("enjoy your entirement");
		} else {
			System.out.println("have a nice day sir!");
		}
		
	}
}