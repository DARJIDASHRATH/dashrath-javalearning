package basicofjava;

/**
 * Wrapper class
 * 
 * @author DASHRATH
 * @version 9.0
 * @since
 */

public class Wrappers {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		int sandBrickPrice = 100;
		Integer ashBrickPrice = new Integer(sandBrickPrice); // Boxing
		System.out.println(sandBrickPrice == ashBrickPrice);
	}

}