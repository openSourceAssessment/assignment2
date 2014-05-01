public class PerKmRental 
{
	private double kilometers;
	private static final int perKm	= 1;
	
	public PerKmRental(Journey journey){
		kilometers = journey.getKilometers();
	}
	
	public double getKilometers(){
		return this.kilometers;
	}
	
	public void setKilometers(double kilometers){
		this.kilometers = kilometers;
	}
	
	public double costPerKm(){
		return this.kilometers*perKm;
	}
}
