package mytestfile;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Adding my details in txt file (myTestFile.txt).
 * 
 * @author DASHRATH
 * @version 24.1
 * @since
 *
 */

public class WriteDetails {

	public static void main(String[] args) {
		try {
			FileWriter writeMyDetails = new FileWriter("myTestFile.txt");// Create txt file
			// Adding my details
			writeMyDetails.write("My Name Is Dashrath . " + "\n");
			writeMyDetails.write("My Brith Month Is January ." + "\n");
			writeMyDetails.write("I Have Done Engineering . " + "\n");
			writeMyDetails.close();
			System.out.println("Write Successfully  ");
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}