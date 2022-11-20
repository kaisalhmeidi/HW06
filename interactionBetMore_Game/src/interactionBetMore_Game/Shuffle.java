package interactionBetMore_Game;

import java.util.Random;

public class Shuffle {
	
	public static int pick_card() {	
		Random randomnumber = new Random();
		int random = 1+randomnumber.nextInt(100);
		return random;
	}
	
}
