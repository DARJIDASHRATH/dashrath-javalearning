package mytestfile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Exception handling
 * 
 * @author DASHRATH
 * @version 25.4
 * @since
 */

public class ExceptionHandling {

	public static void main(String[] args) throws IOException {
		Scanner txtFileReading = new Scanner(new File("myTestFile.txt"));
		while (txtFileReading.hasNext()) {
			String w = txtFileReading.next();
			System.out.println(w);
		}
		txtFileReading.close();
	}
	
}
