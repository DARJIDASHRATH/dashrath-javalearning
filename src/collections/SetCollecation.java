package collections;

/** Set collection. we craete same elemant 
 * and see this elemant is set allow or not. 
 * 
 *  @author DASHRATH
 *  @version 21.1
 *  @since
 */

import java.util.HashSet;
import java.util.Set;

public class SetCollecation {

	public static void main(String[] args) {
		Set<String> ab = new HashSet<String>();
		// Adding elemants
		ab.add("Hello");
		ab.add("World");
		ab.add("$yourname");
		ab.add("Hello"); // Adding same elemant but in Set not allow same elemant.
		ab.add("myname");

		System.out.println(ab);

	}

}
