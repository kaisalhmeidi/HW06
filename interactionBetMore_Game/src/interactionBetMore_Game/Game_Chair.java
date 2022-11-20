package interactionBetMore_Game;

public class Game_Chair {
	
	public static void Start() {
		Player player1 = new Player("Computer");
		Player player2 = new Player("Player2");
		BetMore_Game.Play(player1,0);
		BetMore_Game.Play(player2,0);
		BetMore_Game.FindWinner(player1, player2);
	}
}
