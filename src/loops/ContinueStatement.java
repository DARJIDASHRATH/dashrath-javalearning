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
		int loopStart = 1;
		int loopEndAt = 10;
		for (loopStart = 1; loopStart <= loopEndAt; loopStart++) // For loop conditions. loop go up to 10.
		{
			if (loopStart == 7) {
				continue; // Here we skip number 7 by using continue statment.
			}
			System.out.println(loopStart);
		}
	}

}