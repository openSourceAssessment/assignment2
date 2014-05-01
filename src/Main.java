import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hardcoded manufacturer and model
		Vehicle v = new Vehicle("Audi", "A6", 2003);

		v.printDetails();

		// Vehicle sample distance
		for (int i = 0; i < 10; i++) {
			v.addKilometers(new Random().nextInt(100));
		}
		v.serviceCar();
		System.out.println("\n\n");
		
		v.printDetails();
		System.out.println("\n\n");
		v.print();
		
		
	}

}
