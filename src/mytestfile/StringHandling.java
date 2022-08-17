package mytestfile;

import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * String hanlding
 * 
 * @author DASHRATH
 * @version 25.3
 * @since
 *
 */

public class StringHandling {

	public static String readFileAsString(String fileName) throws Exception {
		String filesDetails = "";
		filesDetails = new String(Files.readAllBytes(Paths.get(fileName)));
		return filesDetails;
	}

	public static void main(String[] args) throws Exception {
		// Print myTestFile.txt file data
		String filesDetails = readFileAsString("D:\\dashrath-learningjava\\myTestFile.txt");
		System.out.println(filesDetails);
	}

}