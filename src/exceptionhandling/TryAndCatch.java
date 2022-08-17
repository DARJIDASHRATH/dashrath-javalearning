package exceptionhandling;

/**
 * Exception handling
 * 
 * @author DASHRATH
 * @version 18.1
 * @since
 */

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int[] rollNumber = { 8, 2, 3, 4, 1, 6, 10, 9, 8 };
			System.out.println(rollNumber[2]);
		} catch (Exception e) {
			System.out.println("I want to print excaption");
		}
	}

}