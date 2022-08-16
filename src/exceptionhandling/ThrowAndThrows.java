package exceptionhandling;

/**
 * Practical Number 18 Throw and Throws
 * 
 * @author DASHRATH
 * @version 18.3
 * @since
 */

public class ThrowAndThrows {

	public static void as() throws IllegalAccessException {
		System.out.println("Throws print");
		throw new IllegalAccessException();
	}

	public static void main(String[] args) {
		try {
			int[] number = { 1, 11, 111, 1111 };
			int mynumber = number[2];
			System.out.println(mynumber);
			as();
		} catch (IllegalAccessException e) {
			System.out.println("Catch print");
		}
	}

}