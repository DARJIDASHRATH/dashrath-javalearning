package mytestfile;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Adding My details in Txt file (myTestFile.txt).
 * 
 * @author DASHRATH
 * @version 24.1
 * @since
 *
 */

public class WriteDetails {

	public static void main(String[] args) {
		try {
			FileWriter write = new FileWriter("myTestFile.txt");// Create object
			// Adding my details
			write.write("My Name Is Dashrath . " + "\n");
			write.write("My Brith Month Is January ." + "\n");
			write.write("I Have Done Engineering . " + "\n");
			write.close();
			System.out.println("Write Successfully  ");
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
	
}