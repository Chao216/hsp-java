// evalue a integer, and put it in correct category

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);

		System.out.println("please enter a integer");
		int unknown = myscan.nextInt();

		if (unknown < 0){
			System.out.println("unknow < 0");
		} else if (unknown == 0){
			System.out.println("unknow = 0");

		} else {
			System.out.println("unknow > 0");
		}

		// switch (unknown){
		// case (unknown < 0):
		// 	System.out.println("smaller than 0");
		// 	break;
		// case (unknown == 0):
		// 	System.out.println("equals 0");
		// 	break;
		// case (unknown > 0):
		// 	System.out.println("greater then 0");
		// 	break;
		// default:
		// 	System.out.println("please enter a valid integer!");
		// }
		
	}
}