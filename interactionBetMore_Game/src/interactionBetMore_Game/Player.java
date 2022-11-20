package interactionBetMore_Game;

public class Player {
	
	public String name;
	public int Card;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}

	
	
	public int getCard() {
		return Card;
	}

	public void setCard(int card) {
		Card = card;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
