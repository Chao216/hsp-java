// here we will create array with []

public class ArrayTaste {
	public static void main(String[] args) {
		double[] milk = {0.65, 0.72, 0.97, 1.21, 1.67, 23, 1, 0.2}; // we create an arry by adding [] after data type

		// System.out.println(milk.length);

		double sum = 0;

		for (int i = 0; i < milk.length; i ++){

			sum += milk[i];

		}

		System.out.println("milk total price is " + sum + " average price is " + (sum / (milk.length)));
	}
}