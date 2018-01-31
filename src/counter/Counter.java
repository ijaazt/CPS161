package counter;

public class Counter {

	private int counter;
	
	public void resetCounter() {
		this.counter = 0;
	}
	
	public void increaseCounter() {
		this.counter++;
	}
	
	public void decreaseCounter() {
		if(this.counter > 0) this.counter--;
	}
	
	public int accessCounter() {
		return this.counter;
	}
	
	public void printCount() {
		System.out.println(this.counter);
	}
	
	public boolean equals(Counter otherCounter) {
		return (this.accessCounter() == otherCounter.accessCounter());
	}
	public String toString() {
		return this.counter + "";
	}
}
