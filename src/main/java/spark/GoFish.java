import java.util.ArrayList;

public class GoFish {
  private ArrayList<Card> mPlayDeck;

  public GoFish() {
    Deck newDeck = new Deck();
    mPlayDeck = newDeck.getCards();
  }

}
