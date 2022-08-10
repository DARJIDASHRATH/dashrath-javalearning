package collections;
import java.util.ArrayList;
import java.util.Collections;
/**
 * TestHospital is the Runner class for Hospital class
 * 
 * @author DASHRATH
 * @version 23.1.2
 * @since 
 */
public class TestHospital {

	public static void main(String[] args) {
		ArrayList<Hospital> zydus = new ArrayList<Hospital>();
		zydus.add(new Hospital(101, "Vijay", 23));
		zydus.add(new Hospital(106, "Ajay", 27));
		zydus.add(new Hospital(105, "jai", 21));
		Collections.sort(zydus);

		for (Hospital kd : zydus) {
			System.out.println(kd.roomNumber + " " + kd.name + " " + kd.date);
		}
	}

}
