// evaluate condition? result for true: result for false

public class TernaryOP {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		int c = (a > b)? 10:100;

		System.out.println(c);

		boolean amy = false;

		String answer = (amy)? "Amy is True":"Amy is False";

		System.out.println(answer);
	}
}