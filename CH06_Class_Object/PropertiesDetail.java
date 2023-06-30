public class PropertiesDetail{
	public static void main(String[] args) {
		
		// the object's default properties follows the rule of array default value;

		Student Chao = new Student();

		System.out.println(Chao.name);
		System.out.println(Chao.age);
		System.out.println(Chao.grade);
		System.out.println(Chao.virgin);

	}
}

class Student{
	String name;
	int age;
	double grade;
	boolean virgin;
}