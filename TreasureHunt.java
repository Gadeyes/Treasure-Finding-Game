// import statement
import java.util.ArrayList;
import java.util.List;

public class TreasureHunt extends Game {
    private Player player; // Represents the player in the game
    private ArrayList<Treasure> treasures; // List to hold treasures in the game
    private int width, height; // Dimensions of the game grid

    // Constructor for TreasureHunt.
    public TreasureHunt(int width, int height) {
      super(); // Calls the constructor of the Game class
      this.width = width;
      this.height = height;
      this.player = new Player(new Point(0, 0)); // Initialize player at (0,0)
      this.treasures = new ArrayList<>();
      placeTreasures(3); // Place 3 treasures randomly
      SortUtil.insertionSort(treasures); // Sort treasures by their value
    }


  
    // Places a specified number of treasures randomly on the grid
    private void placeTreasures(int count) {
      for (int i = 0; i < count; i++) {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        int value = (int) (Math.random() * 100) + 1;// create a random score for each treasure
        treasures.add(new Treasure(new Point(x, y), value));
      }
    }

  

    // Processes the player's move and provides feedback
    public String makeMove(String move) {
      // Store the original position before moving
      Point originalPosition = new Point(player.getPosition().getX(), player.getPosition().getY());
      player.move(move, width, height); // Move the player
      Point newPosition = player.getPosition(); // Get the new position

      
      // Check if the move is valid (player position changed)
      if (newPosition.equals(originalPosition)) {
        return "You can't move further in that direction. Your current location: " + newPosition;
      }

      // Find the nearest treasure and calculate its distance after the move
      Treasure nearestTreasure = SearchUtil.findNearestTreasure(newPosition, treasures);
      double distanceToTreasure = Double.MAX_VALUE;
      
      if (nearestTreasure != null) {
        distanceToTreasure = newPosition.distance(nearestTreasure.getLocation());
      }
      

      // Check if the treasure is found at the new position
      if (nearestTreasure != null && newPosition.equals(nearestTreasure.getLocation())) {
        
        score += nearestTreasure.getValue(); // Increase player's score
        treasures.remove(nearestTreasure); // Remove the found treasure

        
        if (treasures.isEmpty()) {
          gameOver = true; // End game if all treasures are found
          return "You found a treasure! Value: " + nearestTreasure.getValue() + ". All treasures found!";
        }
        
        return "You found a treasure! Value: " + nearestTreasure.getValue() + ". There are more treasures to find. Your current location: " + newPosition;
      }

      // Provide feedback about the player's new position and distance to the nearest treasure
      return "Moved " + move + ". Your current location: " + newPosition + ". Distance to the nearest treasure: " + String.format("%.2f", distanceToTreasure) + " units.";
    }
} // end of TreasureHunt
