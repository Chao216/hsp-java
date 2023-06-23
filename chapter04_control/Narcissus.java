// here Narcissus 水仙花
// if a integer in 3 digits abc = a*a*a + b*b*b + c*c*c then it is a Narcissus number

import java.util.Scanner;

public class Narcissus {
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);

		System.out.println("please enter a three digits number");

		int threeDigs = myscan.nextInt();

		if ((threeDigs > -100 && threeDigs < 100) || threeDigs > 999 || threeDigs < -999 ) {
			System.out.println("please enter an integer in there digits");
		} else {
			int c = threeDigs % 10;
			int b = (Math.floorDiv(threeDigs,10)) % 10;
			int a = (Math.floorDiv(Math.floorDiv(threeDigs,10),10)) % 10;

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

			int temp = a * a *a + b * b * b + c * c * c;

			if ( temp == threeDigs) {
				System.out.println("hey " + threeDigs + " is a Narcissus number!");
			} else {
				System.out.println("it is not a Narcissus number");
			}
		}
	}
}