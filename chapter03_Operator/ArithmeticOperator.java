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
	}
}