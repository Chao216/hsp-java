public class HW06{
	public static void main(String[] args) {

		Cal c1 = new Cal(12,11.8);
		Cal c2 = new Cal(0.3,1.8);

		c1.add(1,2.3);
		c2.div(10.2,5.7);
		
	}
}

class Cal{

	double a;
	double b;

	public Cal(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double add(double a, double b){
		System.out.println(a + " + " + b + " = " + (a+b));
		return a + b;

		
	}

	public double sub(double a, double b){
		System.out.println(a + " - " + b + " = " + (a-b));
		return a - b;
		
	}

	public double mul(double a, double b){
		System.out.println(a + " * " + b + " = " + (a*b));
		return a * b;
		
	}

	public double div(double a, double b){
		System.out.println(a + " / " + b + " = " + (a/b));
		return a / b;
		
	}
}