public class Card {
	
	String surface;
	String suit;
	int value;
	
	Card(String surface, String suit, int value) {
		this.surface = surface;
		this.suit = suit;
		this.value = value;
	}
	
	public void print() {
		System.out.printf("%s of %s : %s\n", surface, suit, String.valueOf(value));
	}

}
