package basicofjava;

/**
 * Using "Constructor" two objects sum
 * 
 * @author DASHRATH
 * @version 7.0
 * @since
 */

public class Aeroplane {

	// Create default constructor
	Aeroplane() {
		System.out.println("Aeroplane current speed");
	}

	Aeroplane(int speed) {
		this();
		this.speed = speed;
	}

	int speed;

	public void speed() {
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// Create two Object for sum of two aeroplanes speed
		Aeroplane airindia = new Aeroplane(100);
		airindia.speed();
		Aeroplane vistara = new Aeroplane(50);
		vistara.speed();

		System.out.println("Total speed of both aeroplane");
		System.out.println(airindia.speed + vistara.speed); // Printing sum of two objects
	}

}