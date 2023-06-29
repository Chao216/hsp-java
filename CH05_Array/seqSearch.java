import java.util.Scanner;

public class seqSearch{
	public static void main(String[] args) {
		String[] names = {"Amy", "Tony", "Cynderiala", "Vova", "Apurva", "Leonid", "Chao"};
		Scanner myScan = new Scanner(System.in);

		System.out.println("who are you looking for?");

		String tgt = myScan.nextLine();// if you want char next().charAt(0);

		boolean found = false;// REMEMBEER this flip trick!

		for (int i = 0; i < names.length; i++){
			if (tgt.equals(names[i])){

				System.out.println("yes " + tgt + " is on our customer list!");
				found = true;
				break;
			} 
			
		}


		if (!found){
			System.out.println("unfortunately we are not able to find " + tgt);
		}


	}
}