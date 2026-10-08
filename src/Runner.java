import java.util.List;

// Game Logic
public class Runner {
    private final List<Player> players;
    private final Deck deck;

    public Runner(List<Player> players) {
        this.players = players;
        this.deck = new Deck();
    }

    // one game / round
    public void playRound() {
        // deal deck
        deck.dealDeck(players);

        // sort player hands
        for (Player player : players) {
            player.sortHand();
        }

        // while there are cards left
        while (!isRoundOver()) {
            for (Player player : players) {
                if (!player.getHand().isEmpty()) {
                    //executeTurn(player);
                }
            }
        }
    }

    // check if cards left
    private boolean isRoundOver() {
        for (Player player : players) {
            if (!player.getHand().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // play turn
    private void executeTurn(Player player) {}
}
