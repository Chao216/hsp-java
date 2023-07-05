public class This01 {
	public static void main(String[] args) {

		Person p1 = new Person("Alicia Allen", 18);
		p1.speak();

		Dog d1 = new Dog("Snoppy",3);

		d1.speak();
		
	}
}

// without this, params in constructure must be different from global variables
class Person {
	String name;
	int age;

	public Person(String pName, int pAge){
		name = pName;
		age = pAge;
	}

	public void speak(){
		System.out.println("my name is " + name + ", and i am " + age + " years old.");
	}
}

// with this keyword, you can use same variables name for params and global variables
class Dog {
	String name;
	int age;

	public Dog(String name, int age) {

		this.name = name;// this.name ====> this created instance propertey name
		this.age = age; // this.age ====> this created instance propertey age
	}

	public void speak(){
		System.out.println("my name is " + name + ", and i am " + age + " years old.");
	}
}