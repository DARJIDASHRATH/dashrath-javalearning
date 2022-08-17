package exceptionhandling;

/**
 * Try,catch and finally exception example
 * 
 * @author DASHRATH
 * @version 18.2
 * @since
 */
public class TryCatchAndFinally {

	public static void main(String[] args) {
		try {
			int[] age = { 18, 20, 21, 23, 25, 27, 29, 31, 35 };
			int myAge = age[3]; // Index value
			System.out.println("No exception Occur :-" + myAge);
		} catch (ArithmeticException e) {
			System.out.println("Catch is executed");
		} finally {
			System.out.println("Finally is executed");
		}
	}

}