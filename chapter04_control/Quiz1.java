public class Quiz1 {
	public static void main(String[] args) {
		double Capital = 100000;
		int pass = 0;

		while (Capital >= 1000){

			pass++;

			if (Capital >= 50000) {
				Capital = Capital * 0.95;
			} else {
				Capital = Capital - 1000;
			}

			if (Capital < 1000){
				System.out.println("not enough money to pass");
				break;
			}

		}

		System.out.println("you can pass " + pass +" times.");


	}
}