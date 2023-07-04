public class HanoiTower{
	public static void main(String[] args) {

		Recu exam = new Recu();
		exam.move(3,'甲','乙','丙');

	}
}

class Recu{
	//num disk numbers, a, b, c for 3 rods
	public void move(int num, char a, char b, char c){// a is departure c is destination. b is transfer

		// recursion 
		

		if (num == 1){
			System.out.println(a + " ======> " + c);
			// if only one, move from a to c
		} else {
			// if more than 1 disk
			// move n-1 from a to b
			// move biggest1 to c
			// move n-1 from b to c

			move(num-1,a,c,b); // move n-1 from a to b with help of c
			System.out.println(a + " ======> " + c); // move the big one from a to c

			
			move(num-1, b,a,c);
			// 移动5个盘
			//把四个盘移动到b
			//把第五个移动到c
			//把四个移动到c

			// 100 个盘子
			// 99 个 a - b
			// 第一百个 a - c
			// 99个 b - c

			// 99 a - b

			//98 a -c
			// No 99 a -b
			// 98 c -b

			// keep recursion.

		}

		



	}
}