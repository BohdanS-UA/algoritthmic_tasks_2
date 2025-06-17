// https://www.codewars.com/kata/5a092d9e46d843b9db000064/train/java

import java.util.HashSet;
import java.util.Set;

class Solution{
    public static int solve(int [] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(-num)) {
                set.remove(-num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
}
