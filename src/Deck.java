import java.util.ArrayList;   // resizeable arrays
import java.util.Collections; // shuffle algo
import java.util.List;        // interface that works with arrays, linkedlist, vector

// Deck List
public class Deck {
    // list that holds Card objects
    private List<Card> cards;

    public Deck() {
        // init the cards instance as an arraylist
        cards = new ArrayList<>();

        // iterate for-each suit in enum Suit : in the Suit array (Suit.values()) returns an array // enum method
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                // .add(object reference) - appends at end of arraylist // collections method
                cards.add(new Card(rank, suit));
            }
        }
        // after list has been filled, shuffle it so Deck is init as shuffled
        shuffle();
    }

    // shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
