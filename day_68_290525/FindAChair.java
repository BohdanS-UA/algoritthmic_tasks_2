// https://www.codewars.com/kata/57f6051c3ff02f3b7300008b/train/java

import java.util.ArrayList;
import java.util.List;

public class TheOffice {
  public static Object meeting(Room[] x, int need) {
        if (need == 0) {
            return "Game On";
        }

        List<Integer> result = new ArrayList<>();

        for (Room room : x) {
            int freeChairs = room.chairs - room.occupants.length();

            if (freeChairs > 0) {
                int taken = Math.min(freeChairs, need);
                result.add(taken);
                need -= taken;
            } else {
                result.add(0);
            }

            if (need == 0) {
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
        }

        return "Not enough!";
  }
}
