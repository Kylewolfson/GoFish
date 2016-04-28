import org.junit.*;
import static org.junit.Assert.*;

public class CardTest {

  @Test
  public void card_initializesCorrectly_true() {
    Card testCard = new Card("Spades", "Ace");
    assertEquals(true, testCard instanceof Card);
  }

  @Test
  public void card_initializesCorrectly_AceSpade() {
    Card testCard = new Card ("Spades", "Ace");
    assertEquals("Ace of Spades", testCard.getCard());
  }
}
