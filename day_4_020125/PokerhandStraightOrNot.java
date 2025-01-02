// https://www.codewars.com/kata/582afcadac2d9baa0900054c/train/java

import java.util.ArrayList;
import java.util.List;

public final class PokerHand {
  public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.contains(14)) {
            cards.add(1);
        }
        List<Integer> sortedUniqueList = cards.stream()
                .sorted()
                .distinct()
                .toList();

        int counter = 1;
        for (int i = 1; i < sortedUniqueList.size(); i++) {
            if (Math.abs(sortedUniqueList.get(i) - sortedUniqueList.get(i - 1)) == 1) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter == 5) {
                return true;
            }
        }
        return false;
  }
}
