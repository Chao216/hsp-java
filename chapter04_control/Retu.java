public class Retu {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++){
			if (i == 96){
				return; // here return is in main, it will quit the whole program.
			}

			System.out.println("i = " + i);
		}
	}
}