
// Represents a treasure in the game. Each treasure has a location and a value associated with it
public class Treasure {
    private Point location; // The grid location of the treasure
    private int value; // The value of the treasure

    // Constructor for Treasure
    public Treasure(Point location, int value) {
      this.location = location; // Set the location of the treasure
      this.value = value; // Set the value of the treasure
    }

    // Returns the location of the treasure
    public Point getLocation() {
      return location;
    }

    // Returns the value of the treasure
    public int getValue() {
      return value;
    }
} // end of Treasure
