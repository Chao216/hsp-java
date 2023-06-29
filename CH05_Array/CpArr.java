public class CpArr{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++){
			arr2[i] = arr1[i];
		}

		System.out.println("arr1 is ------------------------");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		System.out.println("arr2 is ------------------------");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr2[i]);
		}


		arr2[0] = 10086;

		System.out.println("arr2 is ------------------------");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr2[i]);
		}

		System.out.println("arr1 is ------------------------");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}





	}
}