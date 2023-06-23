// this is a enhenced for loop;

import java.util.Scanner;

public class EmptyPyramid {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		System.out.println("how many layers you want for our pyramid ?");

		int layers = myscan.nextInt();// we want to know how many layers to design the pyramid


		for (int i = 1; i <= layers; i ++) { // here we loop though different layers

			for (int k = 1; k <= layers - i; k++){ // here we loop through chars in a line
				System.out.print(" "); // print some space indention before starts
			}
			for (int j = 1; j <= 2 * i - 1; j++){ // first char after space, and last char with *, also the bottom layer

				if (j == 1 || j == 2 * i -1 || i == layers) {
					System.out.print("*");
				} else { // otherwise fill the chars between with space | |
					System.out.print(" ");
				}



				}
				
			System.out.println("");// println will auto change line

		}
	}
}