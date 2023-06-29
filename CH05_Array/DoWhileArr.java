import java.util.Scanner;

public class DoWhileArr{
	public static void main(String[] args) {

		int[] arr = {1,2,3};

		Scanner myScan = new Scanner(System.in);

		do {

			System.out.println("what int do you want to append?");

			int newInt = myScan.nextInt();

			int[] newArr = new int[arr.length + 1];

			for (int i = 0; i < arr.length; i++){
				newArr[i] = arr[i];
			}

			newArr[newArr.length -1] = newInt;

			arr = newArr;

			System.out.println("do you wanna keep adding? y/n");
			char ans = myScan.next().charAt(0);

			if (ans == 'n'){
				break;
			}

		} while (true);


		System.out.println("the arr is ==========================");

		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}


	}
}