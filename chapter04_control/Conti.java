// continue will skip the codes below to another loop directly

public class Conti {
	public static void main(String[] args) {
		int i = 0;
		int count = 0;

		while (i <= 1000){
			i++;

			if (i < 693){
				continue;// break will exit the loop, while continue will skip codes below, and go for another loop;
			}

			System.out.println("i is now at " + i);
			count++;
		}

		System.out.println("codes below continue get executed for " + count + " times.");
	}
}