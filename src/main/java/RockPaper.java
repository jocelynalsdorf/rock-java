import java.util.Map;
import java.util.HashMap;
import java.io.Console;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaper {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/whowon", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/whowon.vtl");

      String playerOne = request.queryParams("playerOne");
      String playerTwo = request.queryParams("playerTwo");

      String whoWins = whoWins(playerOne, playerTwo);

      model.put("playerOne", playerOne);
      model.put("playerTwo", playerTwo);
      model.put("whoWins", whoWins(playerOne, playerTwo));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

    public static String whoWins(String playerOne, String playerTwo)  {

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
