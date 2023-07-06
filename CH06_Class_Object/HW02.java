public class HW02 {
	public static void main(String[] args) {

		String[] test = {"Hello", "Meoto", "Nokia"};

		Metho meme = new Metho();
		meme.find(test,"Nokia");
		
	}
}

class Metho {
	public int find(String[] arr, String target){

		int index = -1;

		for (int i = 0; i < arr.length; i++){
			if (arr[i].equals(target)){
				index = i;

			}
		}

		System.out.println("index = " + index);


		return index;

	}
}