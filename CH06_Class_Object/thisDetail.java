public class thisDetail {
	public static void main(String[] args) {

		Metho meme = new Metho();
		meme.f2();
		
	}
}

class Metho {
	String name = "Sam Smith";
	int height = 183;

	public Metho(){
		this("Peter Park", 193);// this will call the constructor below
		// note , to call other constructor, you must put this line first!!!

		System.out.println("Constructor Method with no params is being called");
	}

	public Metho(String name, int height){

		System.out.println("Constructor Metho with params is being called !");
		this.name = name;// this.name refers to global var name, later name is params
		this.height = height;// this.height refers to global var height, later height is params
	}

	public void f1(){
		System.out.println("f1() is being called !");
		System.out.println(this.name + "is now " + this.height + "cm.");
	}

	public void f2(){
		System.out.println("f2() is being called !");
		this.f1();// methods f1() from instance of Method class
	}


}