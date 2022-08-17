package collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * TestHospital is the runner class for hospital class
 * 
 * @author DASHRATH
 * @version 23.1.2
 * @since
 */

public class TestHospital {

	public static void main(String[] args) {
		ArrayList<Hospital> patientDetails = new ArrayList<Hospital>();
		System.out.println("Room number , Patient name , Patient age");
		patientDetails.add(new Hospital(101, "Vijay", 23));
		patientDetails.add(new Hospital(106, "Ajay", 27));
		patientDetails.add(new Hospital(105, "jai", 21));
		Collections.sort(patientDetails);

		for (Hospital zydus : patientDetails) {
			System.out.println(zydus.roomNumber + " " + zydus.patientName + " " + zydus.patientAge);
		}
	}

}