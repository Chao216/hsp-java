import java.util.Scanner;

public class ArrPop{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		System.out.println("now the left elemments in array is =============================");
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		Scanner myScan = new Scanner(System.in);

		do{
			int[] newArr = new int[arr.length -1];

			for (int i = 0; i < newArr.length; i++){
				newArr[i] = arr[i];
			}

			arr = newArr;

			System.out.println("do you want to continue pop out ? y/n");

			char ans = myScan.next().charAt(0);

			if (ans == 'n' || arr.length == 1){
				break;
			}

		} while (true);

		System.out.println("now the left elemments in array is =============================");
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}