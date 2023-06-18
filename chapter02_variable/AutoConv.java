// here we will see auto type conversion

public class AutoConv {
	public static void main(String[] args) {
		int a = 10;
		double b = a + 1.1;

		float c = a + 2.1f;

		System.out.println(b);
		System.out.println(c);

		byte b1 = 10;
		byte b2 = 20;
		int i1 = b1 + b2; // byte + byte (or char, or short) result must be int !!!
		System.out.println(i1);
	}
}

// by default, whole number is seen as int, decimal as double. if you want float, use 1.2f 
// when calculate with char, byte, short, all result must be int