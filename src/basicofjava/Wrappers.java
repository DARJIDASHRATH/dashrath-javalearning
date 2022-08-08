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
		int i = 100;
		Integer j = new Integer(i); // boxing
		System.out.println(i == j);
	}

}
