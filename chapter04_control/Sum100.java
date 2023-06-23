public class Sum100 {
	public static void main(String[] args) {
		// 1-1/2+1/3-1/4+1/5....100

		double sum = 0;

		for (int i = 1; i <= 100; i++){
			double term = (double)(1.0 / i);

			if (i % 2 == 0){
				sum -= term;
			} else {
				sum += term;
			}			

		}


		System.out.println(sum);
	}
}