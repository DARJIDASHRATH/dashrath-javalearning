package thisandsuper;

/**
 * Testanimal calss have main method for animal and dog class
 * 
 * @author DASHRATH
 * @version 11.2
 * @since
 */

public class TestAnimal extends Dog {
	TestAnimal() // Calling base class constructor
	{
		super(); // Here we are calling our super for getting information
	}

	// Main() method start
	public static void main(String[] args) {
		// Call default constructor of the testAnimal
		new TestAnimal();
		System.out.println();
	}

}