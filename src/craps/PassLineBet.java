package craps;
import java.util.Random;

public class PassLineBet {

	private int diceRoll (int amountOfDice, int sides) {
		int sum = 0;
		Random randomObject = new Random();
		for (int i = 0; i < amountOfDice; i++) {
			sum += randomObject.nextInt(sides) + 1;
		}
		return sum;
		
	}
	
	private boolean firstWin(int rollNumber) {
		switch(rollNumber) {
		case 7:
		case 11: return true;
		default: return false;
		}
	}
	
	private boolean firstLoss(int rollNumber) {
		switch(rollNumber) {
		case 2:
		case 3:
		case 12: return true;
		default: return false;
		}
	}

	private boolean crapsRolls(int thePoint) {
			while(true) {
				int diceRoll = diceRoll(2, 6);
				if(diceRoll == thePoint) {
					return true;
				} else if (diceRoll == 7) {
					return false;
				}
			}
	}
	

/*
 * private boolean crapsRolls(
 */
	
	public boolean craps() {
		int firstRoll = diceRoll(2, 6);
		//return (firstWin(firstRoll) || crapsRolls(firstRoll)) ? true : false;
		System.out.println(firstRoll);
		if(firstWin(firstRoll)) {
			return true;
		} else if(firstLoss(firstRoll)) {
			return false;
		} else if (crapsRolls(firstRoll)) {
			return true;
		}
		return false;
	}
	
//	public String toString(PassLineBet newPassLineBet) {
//		return (String) newPassLineBet;
//		
//	}

}
