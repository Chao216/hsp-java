import java.util.Scanner;

public class arrAdd{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};

		Scanner myScan = new Scanner(System.in);

		int[] newArr = new int[arr1.length + 1];

		for (int i = 0; i < arr1.length; i++){
			newArr[i] = arr1[i];
		}

		newArr[newArr.length -1] = 4;

		for (int i = 0; i < newArr.length; i++){
			System.out.println(newArr[i]);
		}

		current_len = 4;
		int[] addFlex;

		while (true) {
			System.out.println("do you want to keep adding? y/n");

			String ans = myScan.nextLine();

			if (ans == "y") {

				current_len++;
				addFlex = new int[current_len];
				


			}
		}


	}
}