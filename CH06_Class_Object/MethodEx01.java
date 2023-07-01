public class MethodEx01{
	public static void main(String[] args) {

		Tools mytool = new Tools();

		boolean ans = mytool.isEven(10);
		System.out.println(ans);

		mytool.customPrint(10,5,'$');
		
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