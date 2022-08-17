package interfacee;

/**
 * Child class of fruit create object
 * 
 * @author DASHRATH
 * @version 17.0
 * @since
 */

class FruitOne implements Fruit {

	public void apple() {
		System.out.println("Apple price is high");
	}

	public void mango() {
		System.out.println("Mango price is very high");
	}

	public static void main(String[] args) {
		Fruit fruitPrice = new FruitOne();
		fruitPrice.apple();
		fruitPrice.mango();
	}

}