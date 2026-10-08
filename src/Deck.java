import java.util.ArrayList;   // resizeable arrays
import java.util.Collections; // shuffle algo
import java.util.List;        // interface that works with arrays, linkedlist, vector

// Deck List
public class Deck {
    // list that holds Card objects
    private final List<Card> cards;

    public Deck() {
        // init the cards instance as an arraylist
        cards = new ArrayList<>();

        // iterate for-each suit in enum Suit : in the Suit array (Suit.values()) returns an array // enum method
        for (Suit suit : Suit.values()) {
            if (suit == Suit.NONE) { continue; }
            for (Rank rank : Rank.values()) {
                if (rank == Rank.JOKER_BLACK || rank == Rank.JOKER_RED) { continue; }
                // .add(object reference) - appends at end of arraylist // collections method
                cards.add(new Card(rank, suit));
            }
        }
        // add jokers
        cards.add(new Card(Rank.JOKER_BLACK, Suit.NONE));
        cards.add(new Card(Rank.JOKER_RED, Suit.NONE));
        // after list has been filled, shuffle it so Deck is init as shuffled
        shuffle();
    }

    // shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // distributing cards to players
    public void dealDeck(List<Player> players) {
        if (players == null || players.isEmpty()) {
            throw new IllegalArgumentException("No players found!");
        }

        int playerIndex = 0;
        while (!cards.isEmpty()) {
            Card drawn = cards.remove(cards.size() - 1); // no index shifting

            players.get(playerIndex).drawCard(drawn);
            playerIndex = (playerIndex + 1) % players.size();
        }
    }

    // get number of cards in hand
    public int getCardsLeft() {
        return cards.size();
    }












































}
