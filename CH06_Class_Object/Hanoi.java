public class Hanoi{
	public static void main(String[] args) {

		Tower myTow = new Tower();
		myTow.move(3,'A','B','C');
		
	}
}

class Tower{
	public void move(int num, char a, char b, char c){// Depart from A, Dest to C, Transfer in B 
		// if only one plate just move a to c

		if (num == 1){
			System.out.println(a + " =====> " + c);
		} else{// more than 1 plate

			// if 10
			// move top 9 from ato b
			// move N0.10 from a to c
			// move top 9 from b to c
			move(num - 1, a,c,b); // Depart A Dest B, transfer in C
			System.out.println( a + " =====> " + c); // moving the relatively largest one
			move(num - 1, b,a,c);// Depart B, Dest C, Transfer in A;

		}

	}
}