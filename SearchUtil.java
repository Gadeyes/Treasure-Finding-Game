// import statement
import java.util.List;

public class SearchUtil {
  public static Treasure findNearestTreasure(Point playerPosition, List<Treasure> treasures) {
    Treasure nearestTreasure = null;
    double minDistance = Double.MAX_VALUE;
    
    for (Treasure treasure : treasures) {
      double distance = playerPosition.distance(treasure.getLocation());
      
      if (distance < minDistance) {
        minDistance = distance;
        nearestTreasure = treasure;
      }
      
    }
    return nearestTreasure;
  }
} // end of SearchUtil
