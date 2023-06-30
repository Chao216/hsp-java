public class Method02{
	public static void main(String[] args) {

		int[][] scores = {{1,2,3},{4,5,6},{7,8,9}};

		Exercise ex1 = new Exercise();

		ex1.loopThrough(scores);
		
	}
}

class Exercise{
	public void loopThrough(int[][] arr){
		for (int i = 0; i < arr.length; i++){// loop first layer
			for(int j = 0; j< arr[i].length; j++){ // loop second layer
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();// change line
		}
	}
}