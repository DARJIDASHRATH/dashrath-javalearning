package collections;
import java.util.Comparator;

/**Demonstrate Comparator interface
 * sub class of Book class
 * 
 * @author DASHRATH
 * @version 23.2.4
 * @since 
 */
class BookThree implements Comparator<Book> {
	public int compare(Book selfHelp, Book fiction) {
		return selfHelp.name.compareTo(fiction.name);
	}

}
