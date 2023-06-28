public class ArrayEx01 {
	public static void main(String[] args) {
		int[] arr1 = {4, -1, 9, 1024, 10, 23};

		int max = arr1[0];
		int maxIndex = 0;

		for (int i = 1; i < arr1.length; i++){
			if (max < arr1[i]){
				max = arr1[i];
				maxIndex = i;
			}

		}

		System.out.println(max);
		System.out.println(maxIndex);
	}
}