
public class PerDayRental {
	private double kilometers;
	private static final int perDay	= 100;
	
	public PerDayRental(Journey journey){
		kilometers = journey.getKilometers();
	}
	
	public double getKilometers(){
		return this.kilometers;
	}
	
	public void setKilometers(double kilometers){
		this.kilometers = kilometers;
	}
	
	public double costPerDay(){
		return 1*perDay;
	}

}
