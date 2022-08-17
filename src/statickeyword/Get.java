package statickeyword;

/**
 * Using static keyword we count buss pass through get
 *
 * @author DASHRATH
 * @version 12.0
 * @since
 */

public class Get {

	static int count = 0;

	Get() {
		count++; // Increamenting
		System.out.println(count); // Printing count value
	}

	public static void main(String[] args) {
		{
			System.out.println("The bus is passing through the gate.");
		}
		// Craeting an object
		Get busOne = new Get();
		Get busTwo = new Get();
		Get busThree = new Get();
		System.out.println(busOne.toString());
		System.out.println(busTwo.toString());
		System.out.println(busThree.toString());
	}

}