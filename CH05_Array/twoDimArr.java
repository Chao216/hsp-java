public  class twoDimArr{
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
		};

		for (int i = 0; i < arr.length; i++){// first loop through arries inside
			for (int j = 0; j < arr[i].length; j++){ // loop thourgh elements in inner arraies
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println();// change line
		}
	}
}