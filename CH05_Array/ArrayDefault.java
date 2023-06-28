public class ArrayDefault {
	public static void main(String[] args) {
		int[] intArray = new int[5];

		for (int i = 0; i < intArray.length; i++){
			System.out.println(intArray[i]);
		}

		boolean[] booleanArray = new boolean[5];

		for (int i = 0; i < booleanArray.length; i++){
			System.out.println(booleanArray[i]);
		}

		String[] stringArray = new String[5];

		for (int i = 0; i < stringArray.length; i++){
			System.out.println(stringArray[i]);
		}

		char[] charArray = new char[5];

		for (int i = 0; i < charArray.length; i++){
			System.out.println(charArray[i]);// default char is empty space
		}
	}
}