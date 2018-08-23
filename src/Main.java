import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Iniatilized");
		
		Card card = new Card("7", "hearts", 7);
		card.print();
		
		Queue<Card> cards = createCards();
		
	
		
		
	}
	
	static Queue<Card> createCards() {
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		ArrayList<Card> cards = new ArrayList<>(52);
		
		for (String suit: suits) {
			System.out.println(suit);
			
			for (int i = 1; i < 11; ++i) {
				cards.add(new Card(String.valueOf(i), suit, i));
			}
			
			cards.add(new Card("J", suit, 10));
			cards.add(new Card("Q", suit, 10));
			cards.add(new Card("K", suit, 10));
			
		}
		
		Collections.shuffle(cards);

		Queue<Card> card_queue = new LinkedList<>();
		
		for (Card card: cards) {
			card_queue.add(card);
		}
		
		return card_queue;
	}
	
	static void printArray(ArrayList<Card> cards) {
		for (Card card: cards) {
			card.print();
		}
	}
	
}
