package exceptionhandling;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int[] i = new int[4];
			int j = i[4];
		} catch (Exception e) {
			System.out.println("i want to print excaption" + e);

		}

	}
	
}
