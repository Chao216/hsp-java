// we can nesting if controls

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);

		System.out.println("which month ? please enter number in integer");

		int month = scan1.nextInt();

		System.out.println("please enter your age in integer");

		int age = scan1.nextInt();

		if (month >= 4 && month <= 10) {
			if (age >= 18 && age <= 60) {
				System.out.println("price is 60");
			} else if (age < 18) {
				System.out.println("price is 30");
			} else {
				System.out.println("price is 20");
			}

		} else {
			if (age >= 18 && age <= 60) {
				System.out.println("price is 40 yuan");
			} else {
				System.out.println("price is 20 yuan");
			}
		}
	}
}