import java.util.Scanner;

public class YangHui{
	public static void main(String[] args) {

		System.out.println("how many layers do you need?, enter an integer");

		Scanner myScan = new Scanner(System.in);

		int lay = myScan.nextInt();

		int[][] yanghui = new int[lay][];

		for (int i = 0; i < yanghui.length; i++){
			yanghui[i] = new int[i+1];

			for (int j = 0; j < yanghui[i].length; j++){
				if (j == 0 || j == yanghui[i].length -1){
					yanghui[i][j] = 1;
				} else {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
			}
		}


		System.out.println("Yanghui +++++++++++++++++++++++++++++=");
		for (int i = 0; i < yanghui.length; i++){
			for (int j = 0; j < yanghui[i].length; j++){
				System.out.print(yanghui[i][j]+ "\t");
			}

			System.out.println();
		}
		
	}
}