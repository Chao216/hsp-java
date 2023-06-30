import java.util.Scanner;

public class Method01{
	public static void main(String[] args) {

		Person amy = new Person();
		amy.name = "Amy Shelton";
		amy.age = 12;



		amy.speak();
		amy.cal01();

		Scanner myScan = new Scanner(System.in);

		System.out.println("sum up to which number?");
		int n = myScan.nextInt();
		amy.cal02(n);

		System.out.println(amy.getSum(10,100));
		
		
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

	public void cal01(){
		int sum = 0;
		for (int i = 1; i < 1001; i++){
			sum += i;
		}
		System.out.println("sum = " + sum);
	}

	public void cal02(int n){
		int sum = 0;
		for (int i = 1; i <= n; i++){
			sum += i;
		}

		System.out.println("sum up to " + n + " = " + sum);
	}
	// method is public
	// will return an int
	// name is getSum
	// takes 2 arguament int a , int b
	public int getSum(int a, int b){
		int res = a + b;
		return res;
	}
}