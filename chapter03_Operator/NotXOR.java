// ! means NOT, ^ for XOR

public class NotXOR {
	public static void main(String[] args) {
		boolean b1 = true;

		System.out.println("b1 is " + b1);
		System.out.println("!b1 is " + !b1);


		boolean b2 = true;
		boolean b3 = false;

		boolean b1_xor_b2 = b1 ^ b2;
		boolean b1_xor_b3 = b1 ^ b3;

		System.out.println("b1_xor_b2 is " + b1_xor_b2);
		System.out.println("b1_xor_b3 is " + b1_xor_b3);

		
	}
}