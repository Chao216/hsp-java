import java.util.Scanner;

public class MultiLoop01 {
	public static void main(String[] args) {

		double sum = 0;
		double totalScore = 0;
		Scanner myscan = new Scanner(System.in);

		for (int i = 1; i <=3; i++){// three classes to loop through

			for (int j = 1; j <= 5; j++){ // five studnets in each class to loop through

				System.out.println("please enter " + i + " class " + " student No. " + j + "Score" );

				double score = myscan.nextDouble();

				sum += score;

				System.out.println("your score is " + score);

			}

			System.out.println("class "  + i + "average score is " + (sum / 5));

			totalScore += sum;



		}

		System.out.println("average score for all students is " + (totalScore / 15));

		
	}
}