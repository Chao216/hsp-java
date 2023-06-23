// here do while with money pay back
import java.util.Scanner;
public class DoWhileMoney {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);
		char answer = ' ';

		do {
			System.out.println("pay me the god damn money back!");
			System.out.println("I am gonna send you to syberia to grow potatoes");
			System.out.println("are you gonna pay my money back or not ? y/n");
			answer = myscan.next().charAt(0);


		} while (answer != 'y');
	}
}