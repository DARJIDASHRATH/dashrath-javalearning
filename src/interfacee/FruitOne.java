package interfacee;

/**
 * child class of Fruit create object
 * 
 * @author DASHRATH
 * @version 17.0
 * @since
 */

class FruitOne implements Fruit {

	public void apple() {
		System.out.println("Apple Price is high");
	}

	public void mango() {
		System.out.println("Mango price is very high");
	}

	public static void main(String[] args) {
		Fruit A = new FruitOne();
		A.apple();
		A.mango();
	}

}
