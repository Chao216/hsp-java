// here we explore divide, mod , increment

public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.println(10 / 4); // 2 result is int
		System.out.println(10.0 / 4); // 2.5 result is double
		double d = 10 / 4;
		System.out.println(d); // 2.0   10 / 4 give 2 , 2 goes to double as 2.0

		System.out.println(10 % 3); // get the remainder
		System.out.println(-10 % 3);
		System.out.println(10 % -3);


		int i = 0;

		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}

		int j = 0;

		while (j < 10) {
			System.out.println("j = " + j);
			++j;
		}

		int k = 0;
		int l = 0;

		System.out.println("k = " + k);
		System.out.println("l = " + l);

		int front = ++k;  // first k = k +1, then assign to front
		int back = l++;   // first assign to back, then l = l +1

		System.out.println("front is now " + front);
		System.out.println("k is now " + k);
		System.out.println("back is  now " + back);
		System.out.println("l is now " + l);
	}
}