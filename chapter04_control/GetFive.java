public class GetFive {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {

				int added_value = i + j;
				if (i + j == 5) {
					System.out.println(i + " + " + j + " = "+ added_value ) ;
				}
			}
		}
	}
}