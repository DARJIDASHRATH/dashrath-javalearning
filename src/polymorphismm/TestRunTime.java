package polymorphismm;

/**
 * Test class for Runtime and child classs
 * 
 * @author DASHRATH
 * @version 16.1.4
 * @since
 */
public class TestRunTime extends RunTime {

	public static void main(String[] args) {
		System.out.println("Print Company Name");
		RunTime i;

		i = new RunTimeOne();
		i.companyName();

		i = new RunTimeTwo();
		i.companyName();
	}

}
