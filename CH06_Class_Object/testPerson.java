public class testPerson {
	public static void main(String[] args) {

		Person p1 = new Person("Tont",13);
		Person p2 = new Person("Tont",13);

		p2.compareTo(p1,p2);

		p2.compare(p1);
		
	}
}

class Person {
	String name;
	int age;

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p1, Person p2){
		if (p1.name == p2.name && p1.age == p2.age){

			System.out.println("it is the same person!");
			return true;
		} else {
			System.out.println("it is not the same person !");
			return false;
		}
	}

	public boolean compare(Person ins){
		if (this.name == ins.name && this.age == ins.age){
			System.out.println("it is the same person!");
			return true;

		} else {

			System.out.println("it is not the same person !");
			return false;

		}
	}
}