public class HW05 {
	public static void main(String[] args) {

		Circle c1 = new Circle(5.0);

		c1.area();
		c1.circumference();
		
	}
}

class Circle {

	double radius;

	public Circle(double radius){
		this.radius = radius;
	}


	public double circumference(){

		System.out.println("circumference = " + 2 * Math.PI * this.radius);
		return 2 * Math.PI * this.radius;
	}

	public double area(){

		System.out.println("area = " + Math.PI * Math.pow(this.radius,2));
		return Math.PI * Math.pow(this.radius,2);
	}
}