public class Obj01{
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Tiffny";
		cat1.age =3;
		cat1.color ="blue";
		cat1.weight=6.2;

		System.out.println("cat1 is " + cat1.age + " years old. and weights " + cat1.weight + " kgs, and it's " + cat1.color + " and you can call it " + cat1.name );
	}
}

class Cat{
	String name;
	int age;
	String color;
	double weight;
}