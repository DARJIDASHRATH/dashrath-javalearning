package mytestfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Reading txt file using Scanner class
 * 
 * @author DASHRATH
 * @version 25.1.0
 * @since
 */

public class FileHandling {

	public static void main(String[] args) {
		try {
			File fileReading = new File("myTestFile.txt");
			Scanner txtFileReading = new Scanner(fileReading);
			while (txtFileReading.hasNextLine()) {
				String readFile = txtFileReading.nextLine();
				System.out.println(readFile);
			}
			txtFileReading.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}