import java.util.Scanner;

public class catNoOb{
	public static void main(String[] args) {
		String white = "White";
		String grey = "Grey";
		int w_age = 3;
		int g_age = 100;
		String n_white = "小白";
		String n_grey = "小花";

		Scanner myScan = new Scanner(System.in);

		System.out.println("你的猫咪叫什么？");

		String ans = myScan.nextLine();

		if (ans.equals(n_white)){
			System.out.println(n_white + "is " + w_age + " years old and the color is " + white);
		} else if (ans.equals(n_grey)){
			System.out.println(n_grey + "is " + g_age + " years old and the color is " + grey);
		} else{
			System.out.println("we are not able to find " + ans);
		}



	}
}