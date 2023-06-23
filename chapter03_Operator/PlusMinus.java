public class PlusMinus {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(++a+a);// a = a+1 (11) print 11+11


		int b = 16;
		System.out.println(--b-b); // b = b-1 (15) print 15-15


		int c = 100;
		System.out.println(c+++c); //  c++  -> 100 but c ->101  print 100+101

		int d = 50;
		System.out.println(d---d); // d-- -> 50 but d -> 49 print 50-49 
	}
}