package exceptionhandling;

/**
 * Exception Handling // Try and Catch example
 * 
 * @author DASHRATH
 * @version 18.1
 * @since
 */

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int[] i = { 8, 2, 3, 4 };
			System.out.println(i[2]);
		} catch (Exception e) {
			System.out.println("i want to print excaption");

		}

	}

}
