public class NotBy5 {
	public static void main(String[] args) {

		int batches = 0;
		for (int i = 1; i <= 100; i++){

			
			if (i % 5 != 0){
				batches++;
				System.out.print(i + " \t" );

				
				if (batches % 5 == 0){
					System.out.println();
				}
			}
		}

			
	}
}