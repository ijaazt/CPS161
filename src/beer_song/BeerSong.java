package beer_song;

public class BeerSong {
	private int initialAmount;

	public BeerSong(int initialAmount) {
		setInitialAmount(initialAmount);
	}
	
	private void setInitialAmount(int initial) {
		initialAmount = initial;
		if (initialAmount < 0) initialAmount = 0;
		if (initialAmount > 99) initialAmount = 99;
	}
	
	private int onesPlace(int number) {
		if(tensPlace(number) > 0)
			return number - (tensPlace(number) * 10);
		return number;
	}
	private int tensPlace(int number) {
		return number / 10;
	}

	private String returnStringNum (int ones) {
		String[] numberEquivalents = {"Zero", "One", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine"};
		return numberEquivalents[ones];
	}
	private String tensAndUp (int twenties) {
		String[] numberEquivalents = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
				"Seventy", "Eighty", "Ninety"};
		return numberEquivalents[twenties];
	}
	private String tensAndUp (int tens, boolean tensAreIt) {
		String[] numberEquivalents = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen"};
		return (tensAreIt) ? numberEquivalents[tens] : tensAndUp(tens);
	}
	
	private String returnStringNum (int tens, int ones) {
		char delimiter = '-';
		if (tens == 0)
			return returnStringNum(ones);
		if ((tens == 1) && (ones >= 0))
			return tensAndUp(ones, true);
		if((ones == 0) && (tens != 0))
			return tensAndUp(tens);
		
		return  tensAndUp(tens) + delimiter + returnStringNum(ones);
	}

	private String intConverter(int number) {
		return returnStringNum(tensPlace(number), onesPlace(number));
	}
	public void printSong() {
		for(int i = initialAmount; i > 0; i--) {
			String iTransformed = intConverter(i);
			System.out.printf("%s bottles on the wall,", iTransformed);
			System.out.println();
			System.out.printf("%s bottles on the wall,", iTransformed);
			System.out.println();
			System.out.println("Take one down, pass it around,");
			System.out.printf("%s bottles of beer the wall.", iTransformed);
			System.out.println();
		}
		System.out.println("Zero bottles of beer on the wall.");
	}
	
	
}
