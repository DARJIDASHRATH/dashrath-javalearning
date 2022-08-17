package loops;

/**
 * Create triangle pattern using forloop
 * 
 * @author DASHRATH
 * @version 5.0
 * @since
 */

public class ForLoop {

	public static void main(String[] args) {
		int lenght = 5;
		for (int i = 1; i <= lenght; i++) // Condition for for loop, loop goes upto 5.
		{
			for (int j = 1; j <= i; j++) {
				System.out.print(" * "); // Printing * showing triangle pettern
			}
			System.out.println();
		}
	}

}