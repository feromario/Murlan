import java.util.List;

// Game Logic
public class Runner {
    private final List<Player> players;
    private final Deck deck;

    public Runner(List<Player> players) {
        this.players = players;
        this.deck = new Deck();
    }

    public void playRound() {
        // deal deck
        deck.dealDeck(players);

        // sort player hands
        for (Player player : players) {
            //player.sort
        }
    }
}
