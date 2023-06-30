public class Method01{
	public static void main(String[] args) {

		Person amy = new Person();
		amy.name = "Amy Shelton";
		amy.age = 12;

		amy.speak();
		
	}
}

class Person{
	String name;
	int age;

	//public this method is public
	// void this method doesn't return anything
	//speak is the name of method;

	public void speak(){
		System.out.println("塞车，你做的是什么车? 马自达！");
	}
}