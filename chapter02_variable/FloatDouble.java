// here we introduce float and double
// as well as scientific notation

public class FloatDouble {
	public static void main(String[] args) {
		float num1 = 1.2f;
		double num2 = 3.14;
		float num3 = 1.6e10f;
		double num4 = 2.79e-10;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(1.2e3);

		double num5 = 2.5;
		double num6 = 10.0 / 4;

		// if (Math.abs(num5 - num6) < 1e-10) {
		// 	System.out.println("They are very close, almost same !");
		// }
		System.out.println(Math.abs(num5 - num6));
		System.out.println(num5 == num6);

	}
}