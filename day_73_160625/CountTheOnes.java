// https://www.codewars.com/kata/5519e930cd82ff8a9a000216/train/java

public class HammingWeight {
  
    public static int hammingWeight(int i){
        int count = 0;
        while (i != 0) {
            i &= (i - 1);
            count++;
        }
        return count;
    }
}
