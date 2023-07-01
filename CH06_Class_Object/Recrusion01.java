public class Recrusion01{
	public static void main(String[] args) {

		Tools myTool = new Tools();

		myTool.hanjiang(0);

		System.out.println(myTool.factorial(10));
		
	}
}

class Tools{
	public void hanjiang(int n){
		if (n < 100){
			hanjiang(n + 1);
		}

		System.out.println("n = " + n);
	}

	public int factorial(int n){

		if (n == 1){
			return 1;
		} else{
			return factorial(n-1) * n;
		}
	}

	
}