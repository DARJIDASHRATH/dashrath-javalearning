package encapsulation;

/**
 * Using setter and getter we set the value and get value with object
 * 
 * @author DASHRATH
 * @version
 * @since
 */

public class GetterSetter {

	private int flatNumber;

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public static void main(String[] args) {
		GetterSetter society = new GetterSetter();
		society.setFlatNumber(102);
		System.out.println("The Flat Number Is :" + society.getFlatNumber());
	}

}