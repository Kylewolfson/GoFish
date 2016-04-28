import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class GoFishTest {

  @Test
  public void player1GetsACard() {
    GoFish testGame = new GoFish();
    testGame.deal();
    assertEquals(true, testGame.getP1Hand().get(0) instanceof Card);
  }
}
