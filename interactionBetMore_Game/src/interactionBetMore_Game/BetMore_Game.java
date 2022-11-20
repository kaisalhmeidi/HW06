package interactionBetMore_Game;

import java.util.Scanner;

public class BetMore_Game {
	
	
	public static void Play(Player player,int repeatedNumber) {
		
		if(player.name == "Computer") {
			int number = Shuffle.pick_card();
			player.setCard(number);
		}else {
			int number = Shuffle.pick_card();
			player.setCard(number);
			if (repeatedNumber < 5) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Your card number is : " + player.getCard());
				System.out.println("if you want to pick another card please insert 1 , otherwise 0");
				int givenNumber = scanner.nextInt();
				if (givenNumber == 1) {
					repeatedNumber++;
					Play(player, repeatedNumber);
				}
			}
		}
	}
	
	
	public static void FindWinner(Player firstPlayer,Player secondPlayer) {
		
		if (firstPlayer.Card > secondPlayer.Card) {
			System.out.println("The Winner is : " + firstPlayer.name +", "+ "her/his card number is : " + firstPlayer.getCard());
			System.out.println("and the Loser is : " + secondPlayer.name +", "+ "her/his card number is : " + secondPlayer.getCard());
		}else if (firstPlayer.Card < secondPlayer.Card) {
			System.out.println("The Winner is : " + secondPlayer.name +", "+"her/his card number is : " + secondPlayer.getCard());
			System.out.println("and the Loser is : " + firstPlayer.name +", "+ "her/his card number is : " + firstPlayer.getCard());
		}else {
			System.out.println("Draw");
		}
	}
	
}
