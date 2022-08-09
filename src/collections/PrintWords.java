package collections;
/** Print values using an iterator
 * 
 * @author DASHRATH
 * @version  20.0
 * @since
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class PrintWords {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("$yourname");
		list.add("myname");
		
		Iterator<String> i = list.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
	}

}
