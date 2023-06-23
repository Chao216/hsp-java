public class PrintAlp {
	public static void main(String[] args) {
		//print a -z 

		for (int i = 97; i <= 122; i++){
			char letter = (char)i;
			System.out.println(letter);
		}

		// char letter = 97;
		// System.out.println(letter);

		System.out.println();

		int j = 90; // A 65

		while (j >= 65){
			char zimu = (char)j;
			System.out.println(zimu);
			j--;
		}
	}
}