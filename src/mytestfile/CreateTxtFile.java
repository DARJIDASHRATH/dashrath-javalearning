package mytestfile;

import java.io.File;
import java.io.IOException;

/**
 * Created Txt file call myTestFile
 * 
 * @author DASHRATH
 * @version 24.0
 * @since
 */

public class CreateTxtFile {

	public static void main(String[] args) {
		try {
			File txtFile = new File("myTestFile.txt"); // Create object
			if (txtFile.createNewFile()) {
				System.out.println("create" + txtFile.getName());
			} else {
				System.out.println("File all ready created");
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
