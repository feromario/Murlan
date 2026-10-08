import java.util.ArrayList;   // resizeable arrays
import java.util.Collections; // shuffle algo
import java.util.List;        // interface that works with arrays, linkedlist, vector

// Player Abstract
public abstract class Player {
    protected final String name;
    protected final List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return hand;
    }

    public void drawCard(Card card) {
        hand.add(card);
    }


}
