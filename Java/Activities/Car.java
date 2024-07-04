
public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		int tyres = 4;
		int doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Value of Color : " + color);
		System.out.println("Value of transmission : " + transmission);
		System.out.println("Value of make : " + make);
		System.out.println("Value of Color : " + color);
		System.out.println("Value of doors : " + doors);
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void stop() {
		System.out.println("Car has stopped.");
	}
	
}
