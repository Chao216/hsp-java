public class powOfFour {
	public static void main(String[] args) {

		Metho meme = new Metho();

		System.out.println(meme.test(1024));

		for (int i = 1; i < 1024; i++){
			System.out.println("is " + i + " pow of 4?");

			System.out.println(meme.test(i));
			System.out.println();

		}
		
	}
}

class Metho {
	public boolean test(int a){
		
		// a = 1  4^0

		if (a == 1){
			return true;
		} else {
			// when a is  not 1

			if ( a % 4 != 0){
				return false;
			} else {
				return test(a / 4);
			}
		}
	}
}