package thisandsuper;
/**
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
		// Call default constructor of the TestAnimal
		new TestAnimal();
		System.out.println();
	}

}
