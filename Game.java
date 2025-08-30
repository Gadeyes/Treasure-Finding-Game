
public class Game {
    protected int score; // Tracks the player's score
    protected boolean gameOver; // Flag to check if the game is over

    // Constructor for Game
    public Game() {
      this.score = 0; // Initial score is set to 0
      this.gameOver = false; // The game starts as active (not over)
    }

    // Checks if the game is over
    public boolean isGameOver() {
      return gameOver;
    }

    // Returns the current score of the game
    public int getScore() {
      return score;
    }
} // end of Game
