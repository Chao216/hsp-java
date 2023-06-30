import java.util.Scanner;

public class P186_5{
	public static void main(String[] args) {

		Scanner myScan = new Scanner(System.in);
		System.out.println("how many elements you want for the array?");
		int size = myScan.nextInt();

		int[] arr = new int[size];

		int sum = 0;

		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100 +1);

			sum += arr[i];
		}

		System.out.println("=========array===============");

		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[arr.length-1-i] + "\t");
		}

		System.out.println();
		System.out.println("mean value = " + (sum/arr.length));

		int maxIndex = 0;
		int max = arr[0];

		for (int i = 0; i< arr.length; i++){

			if( max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}

		}

		System.out.println("max is " + max);
		System.out.println("index of max is " + maxIndex);

	}
}