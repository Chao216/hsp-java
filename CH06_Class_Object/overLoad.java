// overload means many methods inside a class share the same method name, but takes different paramenters

public class overLoad {

	public static void main(String[] args) {

		OL myOl = new OL();

		System.out.println(myOl.sum(1,2));
		System.out.println(myOl.sum(1,2.3));
		System.out.println(myOl.sum(1.7,3));
		System.out.println(myOl.sum(1.7,3.8));
		System.out.println(myOl.sum("Hello ", "Chao"));
		System.out.println(myOl.sum(10,20,1));
		
	}
	
}

class OL {
	public int sum(int a, int b){
		return a + b;
	}

	public double sum( int a, double b){
		return a + b;
	}

	public double sum(double a, int b){
		return a+b;
	}
	public double sum(double a, double b){
		return a + b;
	}

	public String sum(String a, String b){
		return a + b;
	}

	public int sum(int a, int b, int c){
		return a+b-c;
	}
}