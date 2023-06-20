// review i++ and ++i

public class AriQuiz01 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i = " + i);
		int j = 1;
		System.out.println("j = " + j);
		int k = i++; // keep in mind, i will also change
		System.out.println("k = " + k);
		int m = ++j; // Note j will change as well
		System.out.println("j = " + j);

		System.out.print("\n\tnow, the new i = " + i);
		System.out.print("\n\tnow, the new j = " + j);

	}
}