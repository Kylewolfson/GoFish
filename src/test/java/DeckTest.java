import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest {

  @Test
  public void deck_initializesCorrectly() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck instanceof Deck);
  }
  @Test
  public void getCards_initializesWithCardsList_true() {
    Deck testDeck = new Deck();
    assertEquals(true, testDeck.getCards() instanceof ArrayList);
  }


  @Test
  public void getCards_deckContains52Cards_52() {
    Deck testDeck = new Deck();
    assertEquals(52, testDeck.getCards().size());
  }

  @Test
  public void getCards_cardsAreInitializedWithSuitAndValue_AceOfSpades() {
    Deck testDeck = new Deck();
    Card aceOfSpades = testDeck.getCards().get(0);
    assertEquals("Ace of Spades", aceOfSpades.getCard());
  }

  @Test
  public void getCards_deckContains52DifferentCards_kingOfDiamonds() {
    Deck testDeck = new Deck();
    Card kingOfDiamonds = testDeck.getCards().get(51);
    assertEquals("King of Diamonds", kingOfDiamonds.getCard());
  }
}
