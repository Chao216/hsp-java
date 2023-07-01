public class MethodObj{
	public static void main(String[] args) {

		Dog myDog = new Dog();
		myDog.name = "Jenny";
		myDog.age = 3;

		System.out.println("before call grow method    " +myDog.name+ " is now " + myDog.age + " years old!");

		// create an Tool instance

		Tool myTool = new Tool();

		myTool.grow(myDog);
		System.out.println("after call grow method    " + myDog.name+ " is now " + myDog.age + " years old!");


		
	}
}

class Dog{
	String name;
	int age;
}

class Tool{
	public void grow(Dog dogInstance){
		dogInstance.age = dogInstance.age + 5;
	}
}