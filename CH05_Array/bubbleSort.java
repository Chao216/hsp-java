public class bubbleSort{
	public static void main(String[] args) {
		
		int[] arr = {12,43,23,100,32,10086,23,78,64,52,11,20,107};

		for (int j = 0; j < arr.length-1; j++){// we need to swap arr.length -1 rounds
			for (int i = 0; i < arr.length -1; i++){ // in each round, we need to swap many times
				if (arr[i] > arr[i+1]){
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}

		}

		

		for (int i =0; i< arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}