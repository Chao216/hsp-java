import java.util.Scanner;

public class MethodEx01{
	public static void main(String[] args) {

		Tools mytool = new Tools();

		Scanner myScan = new Scanner(System.in);

		boolean ans = mytool.isEven(10);
		System.out.println(ans);

		System.out.println("how many rows?");
		int rows = myScan.nextInt();
		System.out.println("how many columns");
		int col = myScan.nextInt();
		System.out.println("what char");
		char char1 = myScan.next().charAt(0);

		mytool.customPrint(rows,col,char1);
		
	}
}

class Tools{
	public boolean isEven(int n){
		if (n % 2 == 0){
			return true;
		} else{
			return false;
		}
	}

	public void customPrint(int a, int b, char c){
		for (int i = 0; i <= a; i++){
			for (int j = 0; j <= b; j++){
				System.out.print(c);
			}

			System.out.println();
		}
	}
}