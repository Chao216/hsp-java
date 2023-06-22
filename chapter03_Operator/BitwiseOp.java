// now we will do bitwise operation

public class BitwiseOp {
	public static void main(String[] args) {

		// & when 2 bits are both 1, result is 1
		int a = 0b10000;
		int b = 0b10010;
		int c = a & b;
		String aBin = Integer.toBinaryString(a);
		String bBin = Integer.toBinaryString(b);
		String cBin = Integer.toBinaryString(c);
		System.out.println("a = " + aBin);
		System.out.println("b = " + bBin);
		System.out.println("c = a & b = " + cBin);

		// when there is a 1 in 2 bits, result is 1

		int d = a | b;
		String dBin = Integer.toBinaryString(d);
		System.out.println("d = a | b = " + dBin);

		// when 2 bits are different, result is 1, otherwise 0

		int e = a ^ b;
		String eBin = Integer.toBinaryString(e);
		System.out.println("e = a ^ b = " + eBin);

		// ~ reverse 1 and 0

		int a_re = ~a;
		String a_reBin = Integer.toBinaryString(a_re);

		System.out.println("~a = " + a_reBin);

		int b_re = ~b;
		String b_reBin = Integer.toBinaryString(b_re);

		System.out.println("~b = " + b_reBin);


		// >> move bits to the right

		int a_right2 = a >> 2; // as a /2/2 divided by 2 twice
		String a_right2Bin = Integer.toBinaryString(a_right2);
		System.out.println(a_right2Bin);

		// << move bits to the left, sign not changed

		int b_left2 = b << 2; // multiply by 2 twice
		String b_left2Bin = Integer.toBinaryString(b_left2);
		System.out.println(b_left2Bin);

		// logical right move >>> ignore sign

		int a_LRM3 = a >>> 3;
		String a_LRM3Bin = Integer.toBinaryString(a_LRM3);
		System.out.println("a >>> 3 = " + a_LRM3Bin);





	}
}