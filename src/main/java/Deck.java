import java.util.Arrays;
import java.util.ArrayList;

public class Deck {
  private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String[] VALUES = {
    "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };
  private ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>(); //Why does the function need to be inside the constructor and not outside of it?
    for (String suit : SUITS) {
      for (String value : VALUES) {
        Card newCard = new Card(suit, value);
        System.out.println(newCard.getCard());
        mCards.add(newCard);
      }
    }

  }

public ArrayList<Card> getCards() {
  return mCards;
}

}
