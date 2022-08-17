package thisandsuper;

/**
 *Sub-class for animal class
 * 
 * @author DASHRATH
 * @version 11.1
 * @since
 */

public class Dog extends Animal {
	Dog() {
		String color = "Brown";
		System.out.println("the Dog color is : " + super.color);
		System.out.println("the Dog color is : " + color);
	}

}