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
		// Creating object for every child class
		Mechnical branchOne = new Mechnical();
		branchOne.branchs();
		branchOne.student();

		Electrical branchTwo = new Electrical();
		branchTwo.branchs();
		branchTwo.student();

		Automobile branchThree = new Automobile();
		branchThree.branchs();
		branchThree.student();
	}

}