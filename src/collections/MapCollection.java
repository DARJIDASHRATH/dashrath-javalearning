package collections;
import java.util.HashMap;
import java.util.Map;
/** 
 * Here we create same value in diffent key
 * 
 * @author DASHRATH
 * @version 21.2
 * @since 
 */
public class MapCollection {

	public static void main(String[] args) {
		Map<Integer, String> ba = new HashMap<Integer, String>();
		// Adding key and elemants
		ba.put(101, "Hello");
		ba.put(102, "World");
		ba.put(103, "$yourname");
		ba.put(104, "myname");
		ba.put(105, "World"); // Adding same value to diffrent keys(key 102 and 105 have same value)
		
		System.out.println(ba);
	}

}
