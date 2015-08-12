import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperTest {

  @Test
  public void whoWins_ReturnsValueForKeyTHatEqualsPlayerTwoGuess_String() {
      RockPaper testRockPaper = new RockPaper();
      String play1 = "rock";
      String play2 ="paper";
      String answer = "lose";
      assertEquals(answer, testRockPaper.whoWins(play1,play2 ));
  }



}
