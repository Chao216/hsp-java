public class MethodArray{
	public static void main(String[] args) {

		// create an array

		int[] arr1 = new int[10];

		for(int i = 0; i < arr1.length; i++){
			arr1[i] = (int)(Math.random()*100+1);
		} 

		// create an instance od PlayArray

		PlayArray pa = new PlayArray();

		pa.modify(arr1);

		System.out.println("3 ====array after modifidation in main stack=================");// address copy  in custom class will affect main stack;
		for (int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + "\t");
		}

		System.out.println();




		
	}
}

class PlayArray{
	public void modify(int[] arr){ // because arr is address copy, so modify will affect main stack;

		System.out.println("1 ====array before modifidation in PlayArray stack================");

		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}

		System.out.println();

		// modify the array
		for (int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + 10;
		}



		System.out.println("2 ====array after modifidation in PlayArray stack=================");
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}