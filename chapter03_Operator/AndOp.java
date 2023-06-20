// difference between && , &

// while using && , if condition A is false, following conditions won't be evaluated
// while using logical and &, other conditions will be evaluated!


public class AndOp {
	public static void main(String[] args) {
		int age = 26;

		if (age > 18 & age < 60) {
			System.out.println("you must work hard !");
		}

		if ( age > 10 && age < 20) {
			System.out.println("study hard !");
		} else {
			System.out.println("How do you do ?");
		}

		int a = 3;
		int b = 100;

		if (a != 3 & --b < 100) { // --b will happen for &
			System.out.print("It is True");
		}

		System.out.println("b = " + b);


		int c = 3;
		int d = 100;

		if (c != 3 && --d < 100) { // --d won't happen at all !
			System.out.print("It is True");
		}

		System.out.println("d = " + d);


	}
}