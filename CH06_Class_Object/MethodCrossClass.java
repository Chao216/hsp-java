public class MethodCrossClass{
	public static void main(String[] args) {

		A aInstance = new A();
		aInstance.bark();
		aInstance.speak();
		aInstance.disp();
		
	}
}

class A {
	public void bark(){
		System.out.println("Hi this is bark method from class A being excuted!");
	}

	public void speak(){// if you want use method from same class, just use
		System.out.println("this is speak method from class A, I will use bark method above");
		bark();
		System.out.println("now i have used bark method again!");
	}

	public void disp(){// if you want use method from different class, create an instance first.
		B bInstance = new B();
		bInstance.display(10086);
	}
}

class B {
	public int display(int n){
		System.out.println(n);
		System.out.println("method display is being used from class B");
		return n;
	}
}