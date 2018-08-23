import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Player {
	
	static Queue<Card> cards;
	ArrayList<Card> hand;
	String name;
	int money;
	
	Player(Queue<Card> cards, String name) {
		Player.cards = cards;
		this.name = name;		
	}
}
