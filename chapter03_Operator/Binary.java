// here we talk about binary oct decimal hex

public class Binary {
	public static void main(String[] args) {
		int a = 0b10010; // binary num starts with 0b
		int b = 10010; 
		int c = 010010; //oct starts with 0
		int d = 0x10010;  //hex starts with 0x or 0X

		int e = 0X12A3C;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}
}