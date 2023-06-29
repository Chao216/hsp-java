public class StringCompare{
	public static void main(String[] args) {
		String str1 = "hello world!";
		String[] arr = {"hello world!", "How are you?"};

		

		System.out.println("str1 == arr[0]" + (str1 == arr[0]));
		System.out.println("str1.equals(arr[0])" + (str1.equals(arr[0])));
	}
}