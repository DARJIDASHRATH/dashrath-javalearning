package loops;

/**
 * Using while loop we print 1 to 10 number
 * 
 * @author DASHRATH
 * @version 4.1
 * @since
 */

public class WhileLoop {

	public static void main(String[] args) {
		int numberOfSheet = 1;
		int totalNumberOfSheet = 10;
		while (numberOfSheet <= totalNumberOfSheet) // While loop conditions
		{
			System.out.println(numberOfSheet);
			numberOfSheet++; // Increment numberOfSheet on every loop
		}
	}

}