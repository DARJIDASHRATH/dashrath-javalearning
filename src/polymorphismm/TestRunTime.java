package polymorphismm;

/**
 * Test class for runtime and child classs
 * 
 * @author DASHRATH
 * @version 16.1.4
 * @since
 */
public class TestRunTime extends RunTime {

	public static void main(String[] args) {
		System.out.println("Print company name");
		RunTime company;

		company = new RunTimeOne();
		company.companyName();

		company = new RunTimeTwo();
		company.companyName();
	}

}