
public class Vehicle {
	private String			manufacturer;
	private String			model;
	private int				makeYear;

	private Journey			journey;

	
	@SuppressWarnings("unused")
	private FuelPurchase	fuelPurchase;
	private PerKmRental 	perKmRental;
	private PerDayRental 	perDayRental;
	private Service         service;

	/**
	 * Class constructor
	 */
	public Vehicle() {
		this.manufacturer = "Central";
		this.model = "ITWEB";
		this.makeYear = 2014;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
	}

	/**
	 * Class constructor specifying name of manufacturer, name of model and year
	 * of make.
	 * 
	 * @param manufacturer
	 * @param model
	 * @param makeYear
	 */
	public Vehicle(String manufacturer, String model, int makeYear) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.makeYear = makeYear;
		journey = new Journey();
		fuelPurchase = new FuelPurchase(125.6);
		perKmRental = new PerKmRental(journey);
		perDayRental = new PerDayRental(journey);
		service = new Service();
	}

	/**
	 * Prints details for {@link Vehicle}
	 */
	public void printDetails() {
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Make Year: " + makeYear);
		System.out.println("Total Kilometers Travelled: " + journey.getKilometers());
		System.out.println("Total number of Services due: " + journey.getTotalServices());
		System.out.println("Rentals for kilometers: $ " + perKmRental.costPerKm());
		System.out.println("Rentals for day: $ " + perDayRental.costPerDay());
		if (service.isDueForService(journey))
			System.out.println("Car is due for service");
		else 
			System.out.println("Car is not due for service");

			
	}

	/**
	 * Appends the distance parameter to {@link Journey#getKilometers()}
	 * 
	 * @param distance
	 *            distance of kilometers traveled
	 */
	public void addKilometers(double distance) {
		journey.addKilometers(distance);
		perKmRental.setKilometers(journey.getKilometers());
	}
	public void serviceCar(){
		service.recordService();
	}
	
	public void print(){
		System.out.println("Original statistics:");
		System.out.println("===================");
		
		
		System.out.println("Vehicle:" + this.manufacturer + " " + this.model + " "
							+ "("+this.makeYear+" model)");
			
		System.out.println(journey.getKilometers()+"km travelled raising $ "+ perKmRental.costPerKm());
		
	}
}
