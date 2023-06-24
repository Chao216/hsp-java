// dynamically use array

import java.util.Scanner;
public class DynaArray01 {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		double[] scores;
		scores = new double[5];

		for (int i = 0; i < scores.length; i ++){

			System.out.println("please enter " + (i + 1) + "th student's score.");
			scores[i] = myscan.nextDouble();
		}

		for (int i = 0; i < scores.length; i++){
			System.out.println((i + 1) + "th student's grade is " + scores[i]);
		}
		
	}
}