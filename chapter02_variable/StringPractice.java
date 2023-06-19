// convert normal types to string with + “”

public class StringPractice{
	public static void main(String[] args) {
		int num1 = 1;
		float num2 = 2;
		short num3 = 3;
		long num4 = 4;

		String s1 = num1 + "";
		String s2 = num2 + "";
		String s3 = num3 + "";
		String s4 = num4 + "";
		System.out.println(s1 + "\n"+ s2 + "\n"+ s3+ "\n"+ s4);

		//how do we convert string to int

		String str1 = "10086";
		int int1 = Integer.parseInt(str1);
		System.out.println(int1);

		String str2 = "3.14159";
		double dub1 = Double.parseDouble(str2);
		System.out.println(dub1);
		


	}
}
