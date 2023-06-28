public class ArrayAssign{
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = n1;  // only copy value of n1

		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		n2 = 10086;

		System.out.println("execute n2 = 10086;");

		System.out.println("now n2 = " + n2);
		System.out.println("now n1 = " + n1);
		

		


		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1;

		System.out.println("arr1 is ");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}

		System.out.println("arr2 is ");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr2[i]);
		}



		

		arr2[2] = 10086;// it's a ref copy, it will modify arr1 also!

		System.out.println("execute arr2[2] = 10086;");

		System.out.println("now arr2 is ");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr2[i]);
		}

		System.out.println("now arr1 is ");
		for (int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}



		
	}
}