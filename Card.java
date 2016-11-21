class Card{
	//CONSTANTS
	private static int SPADES = 1;
	private static int HEARTS = 2;
	private static int CLUBS = 3;
	private static int DIAMONDS = 4;

	//INSTANCE VAR
	private int suit;
	private int value;
	//CODE

	Card(int suit, int value){
		this.suit = suit;
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public int getSuit(){
		return suit;
	}

	public int compareSuit(Card c){
		if(c.suit == this.suit)
			return 0;
		if(c.suit>this.suit)
			return 1;
		if(c.suit<this.suit)
			return 2;
		return -1;
	}
	public int compareValue(Card c){
		if(c.value == this.value)
			return 0;
		if(c.value > this.value)
			return 1;
		if(c.value < this.value)
			return 2;
		return -1;
	}
}