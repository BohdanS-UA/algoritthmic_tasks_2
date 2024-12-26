// https://www.codewars.com/kata/57e2dd0bec7d247e5600013a/train/java

import java.util.ArrayList;
import java.util.List;

public class Kata {
  public static Object[] unflatten(int[] flatArray) {
        List<Object> objectList = new ArrayList<>();
        for (int i = 0; i < flatArray.length; i++) {
            if (flatArray[i] < 3) {
                objectList.add(flatArray[i]);
            }
            if (flatArray[i] > 2) {
                int length = 0;
                if (i + flatArray[i] >= flatArray.length) {
                    length = flatArray.length - i;
                } else {
                    length = flatArray[i];
                }
                int[] nestedArray = new int[length];
                for (int j = i; (j < i + flatArray[i] && j < flatArray.length); j++) {
                    nestedArray[j - i] = flatArray[j];
                }
                objectList.add(nestedArray);
                i += flatArray[i] - 1;
            }
        }
        Object[] objects = new Object[objectList.size()];
        for (int i = 0; i < objectList.size(); i++) {
            objects[i] = objectList.get(i);
        }
        return objects;
  }
}
