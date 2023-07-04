public class sumOfTwo{
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int myTarget = 7;

		Metho meme = new Metho();

		int[] answer = meme.sot(arr, myTarget);

		for (int i = 0; i < 2; i++){
			System.out.print(answer[i] + "\t");
		}
		
	}
}

class Metho {
	public int[] sot(int[] arr, int target){

		int[] ans;
		ans = new int[2];

		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++){
				if (arr[i] + arr[j] == target){
					if (i < j){

						

						ans[0] = i;
						ans[1] = j;
						

					}
				}
			}
		}

		return ans;
	}
}