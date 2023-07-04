public class overloadExercise {
	public static void main(String[] args) {

		Methods myMeth = new Methods();

		System.out.println(myMeth.m(10));
		System.out.println(myMeth.m(10,20));
		System.out.println(myMeth.m("Hello China!"));

		System.out.println(myMeth.max(10,100));
		System.out.println(myMeth.max(1.9, 0.13));
		System.out.println(myMeth.max(1.9, 21.3,0.002));
		
	}
}

class Methods {
	public int m(int a){
		return (int)(Math.pow(a,2));
	}

	public int m(int a, int b){
		return a * b;
	}

	public String m(String s){
		return s;
	}

	public int max(int a, int b){
		if (a > b){
			return a;
		} else {
			return b;
		}
	}

	public double max(double a, double b){
		if (a > b){
			return a;
		} else {
			return b;
		}
	}

	public double max( double a, double b, double c){
		if ( a > b ){
			// a compares c

			if ( a > c){
				return a;
			} else {
				return c;
			}
		} else {
			//b compares c

			if (b > c){
				return b;
			} else {
				return c;
			}
		}
	}
}