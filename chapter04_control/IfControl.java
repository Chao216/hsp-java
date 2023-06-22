// here is if else if else

public class IfControl {
	public static void main(String[] args) {
		int age = 26;

		if (age < 7) {
			System.out.println("are you in kindergarten?");
		} else if ( age >= 7 && age <= 22){
			System.out.println("are you a student ?");
		} else if ( age > 22 && age <= 65) {
			System.out.println("are you employeed?");
		} else {
			System.out.println("have a nice day!");
		}
	}
}