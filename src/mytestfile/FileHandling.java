package mytestfile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Reading Txt file using Scanner class
 * 
 * @author DASHRATH
 * @version 25.1.0
 * @since
 */

public class FileHandling {

	public static void main(String[] args) {
		try {
			File ab = new File("myTestFile.txt");
			Scanner my = new Scanner(ab);
			while (my.hasNextLine()) {
				String da = my.nextLine();
				System.out.println(da);
			}
			my.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("error");
		}
	}

}
