package temperature;

public class Temperature {
	private double temperature;
	private char scale;
	
	public Temperature() {
		this.temperature = 0;
		this.scale = 'C';
	}
	public Temperature(char scale) {
		this.scale = scale;
		temperature = 0;
	}
	public Temperature(double temperature) {
		this.scale = 'C';
		this.temperature = temperature;
	}
	public Temperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public double getCelcius() {
		if (this.scale == 'F') return (this.temperature - 32) * 5/9;
		return this.temperature;
	}
	
	public double getFahrenheit() {
		if (this.scale == 'C') return (this.temperature * 9/5 + 32);
		return this.temperature;
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public void setTemperature(double temperature, char scale) {
		this.temperature = temperature;
		this.scale = scale;
	}
	
	public boolean equals(Temperature otherTemperature) {
		return (this.getCelcius() == otherTemperature.getCelcius())
				&& (this.getFahrenheit() == otherTemperature.getFahrenheit());
	}
	
	public boolean higher(Temperature otherTemperature) {
		return (this.getCelcius() > otherTemperature.getCelcius())
				&& (this.getFahrenheit() > otherTemperature.getFahrenheit());
	}
	
	public boolean lower(Temperature otherTemperature) {
		return (this.getCelcius() < otherTemperature.getCelcius())
				&& (this.getFahrenheit() < otherTemperature.getFahrenheit());
	}
	
	public String toString() {
		return this.getCelcius() + " " + this.getFahrenheit();
	}
	

}
