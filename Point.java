// Represents a point in a 2D grid system. This class is used to handle grid positions for various game elements
public class Point {
    private int x; // The x-coordinate of the point
    private int y; // The y-coordinate of the point

    // Constructor for creating a new Point
    public Point(int x, int y) {
      this.x = x; // Set the x-coordinate
      this.y = y; // Set the y-coordinate
    }

    // Gets the x-coordinate of this point
    public int getX() {
      return x;
    }

    // Sets the x-coordinate of this point
    public void setX(int x) {
      this.x = x;
    }

    // Gets the y-coordinate of this point
    public int getY() {
      return y;
    }

    // Sets the y-coordinate of this point
    public void setY(int y) {
      this.y = y;
    }

    // Compares this point to another point for equality
    public boolean equals(Point other) {
      return this.x == other.x && this.y == other.y;
    }

    // Calculates the Manhattan distance to another point. This is used to measure the distance in grid movement terms
    public double distance(Point other) {
      return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
    }

    // Returns a string representation of the point
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
} // end of Point
