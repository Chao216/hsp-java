// here we will discuss the scope of our variables

public class VarScope {
	public static void main(String[] args) {
		
		Metho meme = new Metho();
		meme.test1();
		meme.test2();
		meme.speak();
	}
}

class Metho {

	// outside methods, global variables, all methods can use 
	int age = 26;
	boolean rich = true;

	double salary;

	public void test1(){

		// variables defined inside method, cnanot be used outside.
		int year = 2023;

		String str1 = "Hello world!";

		System.out.println(year);
		System.out.println(str1);
	}

	public void test2(){
		System.out.println(age);
		System.out.println(rich);

		// System.out.println(year);
		// System.out.println(str1);

		System.out.println(salary);

		// local variables must be initakized

		// double weight;
		// System.out.println(weight);


	}

	String code = "Tiffany";

	public void speak(){
		String code = "Dipper";

		System.out.println(code);
	}
}