package basicofjava;

/**
 * using Constructor two objects sum
 * 
 * @author DASHRATH
 * @version 7.0
 * @since
 */

public class Aeroplane {

	// Create Default Constructor
	Aeroplane() {
		System.out.println("Aeroplane started");
	}

	Aeroplane(int speed) {
		this();
		this.speed = speed;
	}
	int speed; // Created Speed variable

	public void speed() {
		System.out.println(speed);
	}

	public static void main(String[] args) {
		// Create Two Object for Sum of Two Aeroplanes Speed
		Aeroplane A = new Aeroplane(100);
		A.speed();
		Aeroplane B = new Aeroplane(50);
		B.speed();

		System.out.println("Total Speed Of Both Aeroplane");
		System.out.println(A.speed + B.speed); // printing sum of two objects
	}

}
