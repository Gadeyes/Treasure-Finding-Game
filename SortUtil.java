import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUtil {
  public static void insertionSort(ArrayList<Treasure> list) {
    list.sort(Comparator.comparingInt(Treasure::getValue));
  }
} // end of SortUtil
