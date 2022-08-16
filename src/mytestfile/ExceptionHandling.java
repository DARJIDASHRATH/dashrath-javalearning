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
		Scanner read = new Scanner(new File("myTestFile.txt"));
		while (read.hasNext()) {
			String w = read.next();
			System.out.println(w);
		}
		read.close();
		}
	}
