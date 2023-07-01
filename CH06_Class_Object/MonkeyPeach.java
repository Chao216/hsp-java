public class MonkeyPeach{
	public static void main(String[] args) {

		Tools myTool = new Tools();
		System.out.println(myTool.howManyPeaches(9));

		for (int i = 0; i < 100; i++){
			System.out.println(myTool.howManyPeaches(i));
		}
		
	}
}

class Tools{
	
	public long howManyPeaches(int days_offset){

		// offset = 0   howMP = 1
		// offset = 1   howMP = (howMP(1-1)+1)*2
		// offset = 2   howMP = (howMP(2-1)+1)*2
		// offset = 3   howMP = (howMP(3-1)+1)*2
		// offset = n   howMP = (howMP(n-1)+1)*2

		if (days_offset < 0){
			System.out.println("must be a non-negative offset");
			return -404;
		} else if ( days_offset == 0){
			return 1;
		} else {
			return (howManyPeaches(days_offset-1)+1)*2L;
		}






	}
}