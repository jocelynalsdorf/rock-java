import java.util.Map;
import java.util.HashMap;
import java.io.Console;

public class RockPaper {
  public static void main(String[] args) {}

    public String whoWins(String player1, String player2)  {

    Map<String, String> rockHash = new HashMap<String, String>();
    Map<String, String> paperHash = new HashMap<String, String>();
    Map<String, String> scissorHash = new HashMap<String, String>();

    rockHash.put("rock", "tie");
    rockHash.put("paper", "lose");
    rockHash.put("scissors", "win");

    paperHash.put("rock", "win");
    paperHash.put("paper", "tie");
    paperHash.put("scissors", "lose");

    scissorHash.put("rock", "lose");
    scissorHash.put("paper", "win");
    scissorHash.put("scissors", "tie");

    if (player2.equals("rock")) {
     return rockHash.get("rock");
    } else if (player2.equals("paper")){
     return rockHash.get("paper");
    } else {
     return rockHash.get("scissors");
    }
  }
}
