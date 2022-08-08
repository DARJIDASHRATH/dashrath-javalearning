package loops;

/**
 * Here we use continue statment in for loop.
 * 
 * @author DASHRATH
 * @version 6.2
 * @since
 */
public class ContinueStatement {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++) // For loop conditions. loop go up to 10.
		{
			if (i == 7) {
				continue; // Here we skip number 7 by using continue statment.
			}
			System.out.println(i);

		}

	}

}
