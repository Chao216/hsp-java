public class ArrayEx1 {
	public static void main(String[] args) {
		char[] alphabet = new char[26];

		int temp = 65;

		for (int i = 0; i < alphabet.length; i++){
			alphabet[i] = (char)temp;
			temp++;

		}

		for (int j = 0; j < alphabet.length; j++){
			System.out.println(alphabet[j]);
		}
	}
}