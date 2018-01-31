package fraction;

public class Fraction {
	int numerator;
	int denominator;
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public double divide() {
		return (double)numerator/denominator;
	}
	
	private int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else return gcd(b, a % b);
	} // I need to make some of these.
	
	public String lowestTerms() {
		int gcd = gcd(numerator, denominator);
		return numerator/gcd + "/" + denominator/gcd;
	}
	
	public Fraction() {
		setNumerator(0);
		setDenominator(0);
		
	}
	public Fraction(int numerator, int denominator) {
		setNumerator(numerator);
		setDenominator(denominator);
	}
}
