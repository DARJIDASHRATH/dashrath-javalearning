package loops;

/**
 * Using break statment we break a loop
 * 
 * @author DASHRATH
 * @version 6.1
 * @since
 */
public class BreakStatement {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++) // For loop conditions. loop go up to 10.
		{
			System.out.print(i);
			if (i == 8) // Here we break loop on number 8.
				break;
			System.out.println();
		}

	}

}
