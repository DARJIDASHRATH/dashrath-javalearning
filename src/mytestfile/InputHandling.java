package mytestfile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input Handling 
 * 
 * @author DASHRATH
 * @version 25.2.0
 * @since
 */

public class InputHandling {

	public static void main(String[] args) throws IOException {
		BufferedReader readFile = new BufferedReader(new InputStreamReader(System.in));
		String name = readFile.readLine();
		int age = Integer.parseInt(readFile.readLine());
		System.out.println("My name is : " + name);
		System.out.println("My age is : " + age);
	}
	
}
