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
	String name;
	int date;

	Hospital(int roomNumber, String name, int date) {
		this.roomNumber = roomNumber;
		this.name = name;
		this.date = date;
	}

	public int compareTo(Hospital kd) {
		if (date == kd.date)
			return 1;
		else if (date > kd.date)
			return 0;
		else
			return 2;
	}

}