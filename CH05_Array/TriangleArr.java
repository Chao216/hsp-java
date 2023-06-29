import java.util.Scanner;

public class TriangleArr{
	public static void main(String[] args) {

		System.out.println("how many layers do yoou want for the triangle? please enter an integer.");

		Scanner myScan = new Scanner(System.in);

		int layers = myScan.nextInt(); // receive the keyboard input

		int[][] arr = new int[layers][];// we defined how many childeren first layer get

		for (int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1];// how many elements in child array

			for (int j = 0; j < arr[i].length; j++){
				arr[i][j] = ((i+1)*(j+1));
			}
		}



		System.out.println("our array is ###############################");
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();
		}
	


		
	}
}