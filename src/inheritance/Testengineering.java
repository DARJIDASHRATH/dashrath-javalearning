package inheritance;

/**
 * Test class for all class
 * 
 * @author DASHRATH
 * @version 15.0
 * @since
 */

public class Testengineering extends Engineering {

	public static void main(String[] args) {
		// creating object of every child class
		Mechnical class1 = new Mechnical();
		((Mechnical) class1).branchs();
		class1.student();

		Electrical class2 = new Electrical();
		class2.branchs();
		class2.student();

		Automobile class3 = new Automobile();
		class3.branchs();
		class3.student();
	}
	
}
