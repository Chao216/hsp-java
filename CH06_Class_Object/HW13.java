public class HW13 {
	public static void main(String[] args) {

		Circle cir1 = new Circle(3.2);
		// cir1.findArea();

		passObject pO1 = new passObject();
		pO1.printAreas(10);
		
	}
}

class Circle{
	double radius;

	public Circle(double radius){
		this.radius = radius;
	}

	public double findArea(){
		System.out.println(" radius = " + this.radius +" area = " + Math.PI*Math.pow(this.radius,2));
		return Math.PI*Math.pow(this.radius,2);
	}
}

class passObject {

	public void printAreas( int times){

		for (int i = 1; i <= times; i++){
			Circle temp = new Circle(i);
			temp.findArea();
		}

	}

}