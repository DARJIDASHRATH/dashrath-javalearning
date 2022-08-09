package collections;

/**Demonstrate Comparator interface
 * TestBook class is the Runner class for Book clss
 * 
 * @author DASHRATH
 * @version 23.2.5
 * @since
 */

import java.util.ArrayList;
import java.util.Collections;

public class TestBook {

	public static void main(String[] args) {
		ArrayList<Book> cross = new ArrayList<Book>();
		// Adding books details (page number , name , edition number).
		cross.add(new Book(215, "Avtar", 3));
		cross.add(new Book(325, "Harry Porter", 12));
		cross.add(new Book(205, "Gita", 1));
		{
			System.out.println("Book Edition"); // Printing book edition number
		}
		Collections.sort(cross, new BookOne());
		for (Book selfHelp : cross) {
			System.out.println(selfHelp.edition);
		}

		{
			System.out.println("Book Total Number of page"); // Printing book page number
		}
		Collections.sort(cross, new BookTwo());
		for (Book selfHelp : cross) {
			System.out.println(selfHelp.pageNumber);
		}

		{
			System.out.println("Book Name"); // Printing name of the book
		}
		Collections.sort(cross, new BookThree());
		for (Book selfHelp : cross) {
			System.out.println(selfHelp.name);

		}
	}

}
