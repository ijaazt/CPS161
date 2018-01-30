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
	
	private String transformNumbers(int number) {

		int ones = number % 10;
		int tens = number / 10;
		String oneString = "";
		String tenString = "";
		switch(ones) {
		case 0: oneString = "Zero"; break;
		case 1: oneString = "One"; break;
		case 2: oneString = "Two"; break;
		case 3: oneString = "Three"; break;
		case 4: oneString = "Four"; break;
		case 5: oneString = "Five"; break;
		case 6: oneString = "Six"; break;
		case 7: oneString = "Seven"; break;
		case 8: oneString = "Eight"; break;
		case 9: oneString = "Nine"; break;
		case 10:oneString = "Ten"; break;
		}
		
		switch(tens) {
		case 0: tenString = ""; break;
		case 1: tenString = "Teen"; break;
		case 2: tenString = "Twenty"; break;
		case 3: tenString = "Thirty"; break;
		case 4: tenString = "Fourty"; break;
		case 5: tenString = "Fifty"; break;
		case 6: tenString = "Sixty"; break;
		case 7: tenString = "Seventy"; break;
		case 8: tenString = "Eighty"; break;
		case 9: tenString = "Ninety"; break;
		}
		
		
		
		if(ones == number)
			return oneString;
		
		if((number % 10) == 0)
			return tenString;
		if((number / 10) == 1)
			return oneString + "-" + tenString;
		
		return tenString + "-" + oneString;
	}
	
	public void printSong() {
		for(int i = initialAmount; i > 0; i--) {
			String iTransformed = transformNumbers(i);
			System.out.printf("%s bottles on the wall,", iTransformed);
			System.out.println();
			System.out.printf("%s bottles on the wall,", iTransformed);
			System.out.println();
			System.out.println("Take one down, pass it around,");
			System.out.printf("%s bottles of beer the wall.", iTransformed);
			System.out.println();
		}
		
	}
	
	
}
