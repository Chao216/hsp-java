public class OrOp {
	public static void main(String[] args) {
		int age = 26;
		if (age > 10 | age > 30) {
			System.out.print("Single |");
		}

		if (age > 10 || age > 30 ) {
			System.out.println("double ||");
		}

		// the main difference is print
		// | will evaluate both
		// || will stop if first condition is true


		int b = 12;

		System.out.println("b = " + b);

		if ( b > 0 | ++b > 30) {
			System.out.println("b = " + b);
		}

		int c = 12;

		System.out.println("c = " + c);

		if (c > 0 || ++c > 30) {
			System.out.println("c = " + c);
		}
	}
}