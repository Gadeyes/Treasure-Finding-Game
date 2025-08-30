
// Represents the player in the game. The player has a position on the grid and can move in different directions
public class Player {
    private Point position; // Current position of the player on the grid

    // Constructor for Player
    public Player(Point position) {
      this.position = position; // Initialize the player's position
    }

    // Moves the player in the specified direction, if possible. The player cannot move outside the boundaries of the grid
    public void move(String direction, int maxWidth, int maxHeight) {
      int newX = position.getX();
      int newY = position.getY();

      switch (direction) {
        case "N":
          newY = Math.min(newY + 1, maxHeight); // Move north if not at the top edge
          break;
        
        case "S":
          newY = Math.max(newY - 1, 0); // Move south if not at the bottom edge
          break;
          
        case "E":
          newX = Math.min(newX + 1, maxWidth); // Move east if not at the right edge
          break;
          
        case "W":
          newX = Math.max(newX - 1, 0); // Move west if not at the left edge
          break;
      }

      // Update the player's position
      position.setX(newX);
      position.setY(newY);
    }

  
    // Returns the current position of the player
    public Point getPosition() {
      return position;
    }
} // end of Player
