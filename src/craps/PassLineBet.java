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
		if(rollNumber == 7 && rollNumber == 11) return true;
		return false;
	}
	
	private boolean firstLoss(int rollNumber) {
		if((rollNumber == 2) || (rollNumber == 3) || (rollNumber == 12))
			return true;
		return false;
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
	

	public boolean craps() {
		int firstRoll = diceRoll(2, 6);
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
	
}
