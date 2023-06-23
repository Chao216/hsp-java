import java.util.Scanner;

public class DingZhen {
	public static void main(String[] args) {

		Scanner myscan = new Scanner(System.in);

		

		int times =3;

		for (int i = 1; i <= 3; i++){

			--times;
			System.out.println("please enter your name");
			String userName = myscan.nextLine();
			System.out.println("please enter your passcode");
			String passCode = myscan.nextLine();

			if ("丁真".equals(userName) && "666".equals(passCode)){ // Note !to evaluate string, use STRING.equals(variable_x)
				System.out.println("哥们儿不费力就住进了高楼，理塘高速路五档起步走！");
				break;
			} else {
				System.out.println("please try again, you still have " + times + " times");
			}

		}
		
	}
}