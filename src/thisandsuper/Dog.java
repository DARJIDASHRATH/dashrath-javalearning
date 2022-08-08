package thisandsuper;

public class Dog extends Animal {

	Dog() {
		String color = "Brown";
		System.out.println("the Dog color is" + super.color);
		System.out.println("the Dog color is" + color);
	}

}
