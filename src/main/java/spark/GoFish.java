import java.util.*;

public class GoFish {
  private ArrayList<Card> mPlayDeck;
  private ArrayList<Card> mPlayer1Hand;
  private ArrayList<Card> mPlayer2Hand;
  private int cardCount;

  public GoFish() {
    Deck newDeck = new Deck();
    mPlayDeck = newDeck.getCards();
    Collections.shuffle(mPlayDeck);
  }

  public void deal() {
    cardCount = 0;
    mPlayer1Hand = new ArrayList();
    mPlayer2Hand = new ArrayList();
    for (int i = 0 ; i < 5 ;i++ ) {
        mPlayer1Hand.add(mPlayDeck.get(cardCount));
        cardCount++;
        mPlayer2Hand.add(mPlayDeck.get(cardCount));
        cardCount++;
    }
    System.out.println(mPlayer1Hand.get(0).getCard());
    System.out.println(mPlayer1Hand.get(1).getCard());
    System.out.println(mPlayer1Hand.get(2).getCard());
    System.out.println(mPlayer1Hand.get(3).getCard());
    System.out.println(mPlayer1Hand.get(4).getCard());
  }

  public ArrayList<Card> getP1Hand() {
    return mPlayer1Hand;
  }

}
