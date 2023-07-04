public class sumArray {
	public static void main(String[] args) {

		int[] test =  new int[10];

		for(int i = 0; i < test.length; i++){
			test[i] = (int)(Math.random()*100+1);
		}

		System.out.println("======array test =========");
		for (int i = 0; i < test.length; i++){
			
			System.out.print(test[i] + "\t");
		}

		System.out.println();

		Metho meme = new Metho();

		System.out.println("====================sum of array test ===============\n" + meme.sumArray(test));
		
	}
}

class Metho {
	public int sumArray(int[] arr){
		if (arr.length == 0){
			return 0;
		} else {

			int tail = arr[arr.length-1];// get last element of array

			// then create a new array without last element 


			int[] newarr = new int[arr.length -1];// let us vreate a new array
			for (int i = 0; i < newarr.length; i++){
				newarr[i] = arr[i];// copy old array to new array
			}

			// arr = newarr;

			return tail + sumArray(newarr);

		}
	}
}