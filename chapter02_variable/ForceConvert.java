public class ForceConvert {
	public static void main(String[] args) {
		int n1 = (int)1.998;
		System.out.println(n1);// precison loss

		byte b1 = (byte)10086;
		System.out.println(b1); // number overflow

		// note force convert only apply to nearst value
		// int n2 = (int)2.3 * 5 - 4 * 2; it doesn't work
		int n2 = (int)(2.3 * 5 - 4 * 2); // this actuall work

		System.out.println(n2);
	}
}