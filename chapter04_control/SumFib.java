// sum first 100 fibonnacci number

public class SumFib {
	public static void main(String[] args) {
		// (1) + (1+2) + (1+2+3) + ... + (1+2+3...+100)
		

		int sum = 0;
		int totalSum = 0;

		for (int k = 1; k <= 100; k ++){
			for (int i = 1; i <= k; i++){

				sum += i;
				System.out.println(sum);
			}

			totalSum += sum;

		}

		System.out.println("the answer is " + totalSum);

		
	}
		
}