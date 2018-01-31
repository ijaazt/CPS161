package odometer;

public class Odometer {
	private double odometer;
	private double fuelEfficiency;
	
	public void resetOdometer() {
		this.odometer = 0;
	}
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	public void setMilesDriven(double odometer) {
		this.odometer += odometer;
	}
	
	public double getGallonsConsumed() {
		return odometer/fuelEfficiency;
	}
	
	public Odometer() {
		
	}
}
