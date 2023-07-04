// you can pass in different number of arguments

public class varArgs {
	public static void main(String[] args) {

		Metho meme = new Metho();

		System.out.println(meme.sum(1));
		System.out.println(meme.sum(1,2));
		System.out.println(meme.sum(1,2,3));
		System.out.println(meme.sum(1,2,3,4));
		System.out.println(meme.sum(1,2,3,4,5));
		
	}
}

class Metho {
	public int sum(int... nums){ // int... means you can pass 0 - many int arguaments here

		System.out.println("you have passed " + nums.length + " arguments");

		int sum = 0;

		for (int i = 0; i < nums.length; i++){

			sum += nums[i];

		}

		return sum;
	}
}