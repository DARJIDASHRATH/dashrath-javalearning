package abstraction;

/**
 * 
 * @author DASHRATH
 * @version 13.0
 * @since
 */

abstract class Vehicle {	 // Abstract method

	public abstract void vehicleTyre();

	public void numberOfPassenger() {
		System.out.println("Depend on vehicle type");
	}
}

class Bus extends Vehicle {	 // Bus class extends with Vehicle class

	public void vehicleTyre() {
		System.out.println("The tyre of the bus are 6");
	}

	public static void main(String[] args) {
		// creating schoolbus as object
		Bus schoolbus = new Bus();
		schoolbus.vehicleTyre();
		schoolbus.numberOfPassenger();
	}

}
