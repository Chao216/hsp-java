public class multiplyFromTo {
	public static void main(String[] args) {

		Metho meme = new Metho();

		System.out.println(meme.mult(1,3));
		System.out.println(meme.mult(9,11));
		
	}
}

class Metho {
	public int mult(int start, int end){
		if (start < end){

			return end * mult(start, end - 1);

		} else {
			return end;
		}
	}
}