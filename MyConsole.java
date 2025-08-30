/*
Title: Treasure Hunt Adventure
Summary: This game offers an engaging treasure hunt experience in a grid-based setting. Players navigate through a grid to locate hidden treasures, guided by distance feedback after each move. 
The game incorporates strategic movement, distance calculations, and a scoring system, creating a challenging yet enjoyable experience.
The program features a grid system for movement, treasure locations with value assignments, and player feedback based on proximity to the nearest treasure. 
Program Element List: Player (custom class for player actions), Treasure (custom class representing treasures), Point (utility class for coordinates), TreasureHunt (game logic and interaction), 
Game (base class for game state), movement handling (N/S/E/W), treasure placement and distance calculation, user input handling (Scanner).
Date: 2023/1/24
Name: Hank Wu
*/


// import statement
import java.util.Scanner;

public class MyConsole {
    public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);
      // Initialize the Treasure Hunt game on a 50x50 grid
      TreasureHunt game = new TreasureHunt(50, 50);

      // Game loop: continues until the game is over
      while (!game.isGameOver()) {
        System.out.println("Enter your move (N/S/E/W):");
        String move = scanner.next().toUpperCase();

        // Check for valid input (N, S, E, W)
        if (!"NSEW".contains(move)) {
          System.out.println("Invalid move. Please enter N, S, E, or W.");
          continue;
        }

        // Process the move and get the result
        String result = game.makeMove(move);
        System.out.println(result);
      }

      // Game over, display final score
      System.out.println("Game Over! Your score: " + game.getScore());
      scanner.close();
    }
} // end of MyConsole


/*
Note: This program can accept any input without crashing
Test code: try inputting some invalid options
*/