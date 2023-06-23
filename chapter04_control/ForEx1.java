// for exercise 1

public class ForEx1 {
	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			
			if (i % 9 == 0) {
				System.out.println(i);
				num++;
				sum += i;
			}
		}

		System.out.println("there are " +  num + " numbers !");
		System.out.println("total sum is " + sum);
	}
}