package loops;

/**
 * Using do-while loop print 1 to 10
 * 
 * @author DASHRATH
 * @version 4.2
 * @since
 */

public class DoWhile {

	public static void main(String[] args) {
		int loopStart = 1;
		int loopEndAt = 10;
		do {
			System.out.println(loopStart);
			loopStart++; // Increament in i veriable
		} while (loopStart <= loopEndAt); // While loop contion
	}

}