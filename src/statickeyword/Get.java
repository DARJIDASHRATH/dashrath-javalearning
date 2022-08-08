package statickeyword;

/**
 * using static keyword we count buss pass through get
 *
 * @author DASHRATH
 * @version 12.0
 * @since
 */
public class Get {

	static int count = 0;

	Get() {
		count++; // increamenting
		System.out.println(count); // printing count value
	}

	public static void main(String[] args) {
		{
			System.out.println("Bus Passing Through Get");
		}
		// craeting an object
		Get b1 = new Get();
		Get b2 = new Get();
		Get b3 = new Get();

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
	}

}
