import java.util.Scanner;
public class P186_4{
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};

		Scanner myScan = new Scanner(System.in);

		do{
			System.out.println("add an integer.");

			int newInt = myScan.nextInt();

			int[] newArr = new int[arr.length + 1];// create a new array length + 1

			for (int i = 0; i < arr.length; i++){
				newArr[i] = arr[i];
			}

			newArr[newArr.length-1] = newInt;

			arr = newArr;

			//1 2 3 4 5 6 7 8 9

			// we need to sort the arry. let us use bubble sort

			for (int i = 0; i < arr.length-1; i++){
				for (int j = 0; j < arr.length-1; j++){
					if (arr[j] > arr[j+1]){
						int temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
					}
				}
			}

			System.out.println("want some more y/n");
			char ans = myScan.next().charAt(0);

			if (ans == 'n'){
				break;
			}

		} while (true);

		System.out.println("the new array $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + "\t");
		}

		

		


	}
}