package ChallengePart2.Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class migrationbirds {

  public static void main(String[] args) {
Map<Integer, Integer> map = new HashMap<>();
map.put(4, 3);
map.put(1, 1);
map.put(5, 1);

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}

    }
  }

