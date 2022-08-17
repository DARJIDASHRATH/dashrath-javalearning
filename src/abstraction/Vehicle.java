package abstraction;

/**
 * Demonstrate for abstraction
 * 
 * @author DASHRATH
 * @version 13.0
 * @since
 */

abstract class Vehicle {

	public abstract void vehicleTyre();

	public void numberOfPassenger() {
		System.out.println("Depend on vehicle type");
	}

}

class Bus extends Vehicle {

	public void vehicleTyre() {
		System.out.println("The tyre of the bus are 6");
	}

	public static void main(String[] args) {
		Bus schoolBus = new Bus();
		schoolBus.vehicleTyre();
		schoolBus.numberOfPassenger();
	}

}
