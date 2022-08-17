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
		int loopStart = 1;
		int loopEndAt = 10;
		for (loopStart = 1; loopStart <= loopEndAt; loopStart++) // For loop conditions. loop go up to 10.
		{
			System.out.print(loopStart);
			if (loopStart == 8) // Here we break loop on number 8.
				break;
			System.out.println();
		}
	}

}