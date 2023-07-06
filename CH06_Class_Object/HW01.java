public class HW01 {
	public static void main(String[] args) {

		double[] test = new double[10];

		for (int i = 0; i < test.length; i++){
			test[i] = Math.random()*100;
		}

		System.out.println("=======array test==================");

		for (int i = 0; i <test.length; i++){
			System.out.print(test[i]+"\t");
		}

		System.out.println();

		Metho meme = new Metho();

		meme.max(test);
		
	}
}

class Metho {
	public double max(double[] arr){
		double max = arr[0];
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println("max = " + max);

		return max;
	}
}