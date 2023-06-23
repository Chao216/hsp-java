// use break to stop loop

public class BreakControl {
	public static void main(String[] args) {

		int count = 0;
		

		while (true) {
			count++;
			int num = (int)(Math.random() * 100 + 1);
			System.out.println(num);

			if ( num == 97) {
				break;
			}
		}

		System.out.println("we tried " + count + " times to get 97" );
	}
}