public class constructor {
	public static void main(String[] args) {

		Person per1 = new Person("Valadimir", 29);

		System.out.println(per1.name + "  " + per1.age);

		Person per2 = new Person("Chao");

		System.out.println(per2.name + "  " + per2.age);

		Dog dog1 = new Dog();

		
	}
}

class Person {
	String name;
	int age;

	// same as method overload, you can create overload for constructor (it is also a method!!!)

	public Person(String pName, int pAge){
		System.out.println("constructor Person is being executed !");
		name = pName;
		age = pAge;
	}

	public Person(String pName){
		System.out.println("second constrcutr is being executed!");
		name = pName;
	}

	
}


class Dog {

}