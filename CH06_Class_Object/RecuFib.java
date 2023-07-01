public class RecuFib{
	public static void main(String[] args) {

		Tools myTool = new Tools();
		System.out.println("fib 10 = " + myTool.fib(10));
		
	}
}

class Tools {
	public int fib(int n){
		if ( n == 1 || n == 2){
			return 1;
		} else {
			return (fib(n-1) + fib(n-2));
		}
	}
}