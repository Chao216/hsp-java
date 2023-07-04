public class overloadExercise {
	public static void main(String[] args) {

		Methods myMeth = new Methods();

		System.out.println(myMeth.m(10));
		System.out.println(myMeth.m(10,20));
		System.out.println(myMeth.m("Hello China!"));
		
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
}