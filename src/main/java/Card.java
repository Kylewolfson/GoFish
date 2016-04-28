import java.util.ArrayList;

public class Card {
  private String mValue;
  private String mSuit;

  public Card(String suits, String values) {
    mValue = values;
    mSuit = suits;
}
    public String getValue() {
      return mValue;

    }

    public String getSuit() {
      return mSuit;
    }

    public String getCard() {
      return String.format("%s of %s", mValue, mSuit);
    }
}
