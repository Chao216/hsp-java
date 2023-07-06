public class HW03{
	public static void main(String[] args) {

		Book b1 = new Book();
		b1.updatePrice(190);
		
	}
}

class Book{
	public double updatePrice(double price){
		if (price >= 150){
			price = 150;
		} else if (price >= 100 && price < 150){
			price = 100;
		}
		System.out.println("the new price will be " + price);
		return price;
	}
}