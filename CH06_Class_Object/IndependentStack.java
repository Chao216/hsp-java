public class IndependentStack{
	public static void main(String[] args) {

		Example exam = new Example();

		int a = 100;
		int b = 200;

		exam.swap(a,b);
		System.out.println("a = " + a + " b = " +b +" from main stack!"); // because swap only affect example stack!


		
	}
}

class Example{
	public void swap(int a, int b){// things happen in example stack does not affect main stack!!!
		System.out.println("a = " + a + " b = " +b +" before swap");
		int temp = b;
		b = a;
		a = temp;

		System.out.println("a = " + a + " b = " +b +" after swap");
	}
}