package July26TakeHome;

public class Player {
	private int playerId;
	private int betValue;
	private Cards choosenCard;
	private String chosenOrientation;
	
	public Player() {
		
	}

	public Player(int playerId,int betValue, Cards choosenCard, String chosenOrientation) {
		this.playerId=playerId;
		this.betValue = betValue;
		this.choosenCard = choosenCard;
		this.chosenOrientation = chosenOrientation;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getBetValue() {
		return betValue;
	}

	public void setBetValue(int betValue) {
		this.betValue = betValue;
	}

	public Cards getChoosenCard() {
		return choosenCard;
	}

	public void setChoosenCard(Cards choosenCard) {
		this.choosenCard = choosenCard;
	}

	public String getChosenOrientation() {
		return chosenOrientation;
	}

	public void setChosenOrientation(String chosenOrientation) {
		this.chosenOrientation = chosenOrientation;
	}
	
	
}
