package collections;

/**
 * Demostrate comperable interface
 * 
 * 
 * @author DASHRATH
 * @version 23.1.1
 * @since
 */

class Hospital implements Comparable<Hospital> {

	int roomNumber;
	String patientName;
	int patientAge;

	Hospital(int roomNumber, String patientName, int patientEnteryDate) {
		this.roomNumber = roomNumber;
		this.patientName = patientName;
		this.patientAge = patientEnteryDate;
	}

	public int compareTo(Hospital zydus) {
		if (patientAge == zydus.patientAge) {
			return 1;
		} else {
			if (patientAge > zydus.patientAge) {
				return 0;
			} else {
				return 2;
			}
		}
	}

}