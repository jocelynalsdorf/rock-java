import java.util.Map;
import java.util.HashMap;
import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaper {
  public static void main(String[] args) {}

    public String whoWins(String playerOne, String playerTwo)  {

    String player1= playerOne.toLowerCase();
    String player2= playerTwo.toLowerCase();

    Map<String, String> rockHash = new HashMap<String, String>();
    Map<String, String> paperHash = new HashMap<String, String>();
    Map<String, String> scissorHash = new HashMap<String, String>();

    rockHash.put("rock", "It's a tie.");
    rockHash.put("paper", "Player two, you win!");
    rockHash.put("scissors", "Player one, you win!");

    paperHash.put("rock", "Player one, you win!");
    paperHash.put("paper", "It's a tie.");
    paperHash.put("scissors", "Player two, you win!");

    scissorHash.put("rock", "Player two, you win!");
    scissorHash.put("paper", "Player one, you win!");
    scissorHash.put("scissors", "It's a tie.");

    if(player1.equals("rock")){

      return rockHash.get(player2);

    } else if(player1.equals("paper")){

      return paperHash.get(player2);

    } else {

      return scissorHash.get(player2);

    }

  }
}
