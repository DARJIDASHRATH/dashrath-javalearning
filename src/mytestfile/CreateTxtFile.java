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
			File file = new File("myTestFile.txt"); // Create object
			if (file.createNewFile()) {
				System.out.println("create" + file.getName());
			} else {
				System.out.println("error");
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

}
