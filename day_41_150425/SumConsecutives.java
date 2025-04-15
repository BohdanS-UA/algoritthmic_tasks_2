// https://www.codewars.com/kata/55eeddff3f64c954c2000059/train/java

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Consecutives {
    
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<>();
        int currentSum = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            if (Objects.equals(s.get(i), s.get(i - 1))) {
                currentSum += s.get(i);
            } else {
                result.add(currentSum);
                currentSum = s.get(i);
            }
        }
        result.add(currentSum);
        return result;
    }

}
