// Card Object
public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() { return rank; }
    public Suit getSuit() { return suit; }

    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        if (other == null) {
            throw new NullPointerException("Cannot compare to null");
        }

        int rankComparison = this.rank.compareTo(other.getRank());
        if (rankComparison != 0) {
            return rankComparison;
        }

        return this.suit.compareTo(other.getSuit());
    }
}

