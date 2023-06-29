public class swapArr {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};

		System.out.println("arr1 is ==============================");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		for (int i = 0; i < arr1.length/2; i++){
			int temp = arr1[i];
			arr1[i] = arr1[arr1.length-1 -i];
			arr1[arr1.length -1 -i] = temp;
		}

		System.out.println("arr1 is ==============================");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}