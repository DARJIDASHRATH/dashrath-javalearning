package loops;

/**
 * create triangle pattern using forloop
 * 
 * @author DASHRATH
 * @version 5.0
 * @since
 */
public class ForLoop {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) // condition for for loop, loop goes upto 5.
		{
			for (int j = 1; j <= i; j++) {
				System.out.print(" * "); // printing * showing triangle pettern
			}
			System.out.println();
		}

	}

}
