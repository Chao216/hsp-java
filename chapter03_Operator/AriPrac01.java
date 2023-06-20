public class AriPrac01 {
	public static void main(String[] args) {
		int i = 1;
		i = i++; // temp = i (1 at this time), i = i + 1 (2), i = temp (1)

		System.out.println(i);

		int j = 1;
		j = ++j; // j = j +1 (2), then temp = j, j = temp (2)

		System.out.println(j);
	}
}