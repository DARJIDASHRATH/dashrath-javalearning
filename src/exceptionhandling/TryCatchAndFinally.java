package exceptionhandling;

/**
 * Try,catch and Finally exception example
 * 
 * @author DASHRATH
 * @version 18.2
 * @since
 */
public class TryCatchAndFinally {

	public static void main(String[] args) {
		try {
			int[] age = { 18, 20, 21, 23, 25, 27, 29, 31, 35 };
			int i = age[10]; // Index value
			System.out.println("No exception Occur :-" + " " + i);
		} catch (ArithmeticException e) {
			System.out.println("Catch is executed");
		} finally {
			System.out.println("Finally is executed");

		}

	}

}
