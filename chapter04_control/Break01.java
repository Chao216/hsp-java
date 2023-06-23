import java.util.Scanner;


public class Break01 {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		System.out.println("set max number");
		int max = myscan.nextInt();

		System.out.println("close the sum at what number?");
		int stop = myscan.nextInt();


		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;

			System.out.println("sum is " + sum);

			if (sum >= stop) {
				break;
			}

		}
	}
}