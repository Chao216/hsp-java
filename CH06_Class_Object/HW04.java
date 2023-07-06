public class HW04{
	public static void main(String[] args) {

		int[] old = {1,2,3,4,5};

		Metho meme = new Metho();

		int[] newA = meme.copyArray(old);

		System.out.println("new array================");
		for (int i = 0; i < newA.length; i++){
			System.out.print(newA[i]+"\t");
		}

		System.out.println();
		
	}
}

class Metho {
	public int[] copyArray(int[] arr){
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}

		return newArr;
	}
}