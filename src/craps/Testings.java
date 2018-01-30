package craps;
import craps.PassLineBet;

public class Testings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassLineBet myBet = new PassLineBet();
//		System.out.println(myBet.DiceRoll(2, 6));
		int i;
		
		int flips = 1000000000;
		int wins = 0;
		for(i = 0; i < flips; i++)
			wins += (myBet.craps()) ? 1 : 0;
		
		double winPercentage = (double)wins/flips * 100;
		
		System.out.printf("Win percentage: %2f", winPercentage);
	}

}
