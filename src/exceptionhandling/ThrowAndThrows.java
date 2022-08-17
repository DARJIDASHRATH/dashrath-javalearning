package exceptionhandling;

/**
 * Practical number 18 throw and throws
 * 
 * @author DASHRATH
 * @version 18.3
 * @since
 */

public class ThrowAndThrows {

	public static void as() throws IllegalAccessException {
		throw new IllegalAccessException();
	}

	public static void main(String[] args) {
		try {
			int[] accountNumber = { 1, 11, 111, 1111 };
			int myAccountNumber = accountNumber[3];
			System.out.println(myAccountNumber);
			as();
		} catch (IllegalAccessException e) {
			System.out.println("Print error ");
		}
	}

}