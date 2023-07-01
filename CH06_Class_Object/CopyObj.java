public class CopyObj{
	public static void main(String[] args) {

		// create an instance for milk;

		Milk mielko = new Milk();
		mielko.volume = 1000;
		mielko.price = 8.7;

		Tools myTools = new Tools();

		Milk valio = myTools.copyMilk(mielko);

		System.out.println("valio volume = " + valio.volume + "valio price = " + valio.price);
		
	}
}

class Milk{
	int volume;
	double price;
}

class Tools {
	public Milk copyMilk(Milk instance){
		Milk newInstance = new Milk();
		newInstance.price = instance.price;
		newInstance.volume = instance.volume;

		return newInstance;
	}
}