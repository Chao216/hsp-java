public class HW07 {
	public static void main(String[] args) {

		Dog dog1 = new Dog("Henry", "Yellow", (byte)5);
		dog1.show();
		
	}
}

class Dog {
	String name;
	String color;
	byte age;

	// make a constructor
	public Dog(String name, String color, byte age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(){
		System.out.println("Dog name: " + this.name + ", color : " + this.color + ", age : " + this.age);
	}




}