// plus operator is always excuted from left to right
// string + int/double , we get string
// int + int we get int

public class PlusOp{

	public static void main(String[] args) {
		System.out.println(10 + 12);
		System.out.println("10086" + 12);
		System.out.println(10 + "Hello Mr ");
		System.out.println(10 + 12.128);
		System.out.println(10 + "N");
		int pi = 31415;
		System.out.println(pi == 31415);

	}
}