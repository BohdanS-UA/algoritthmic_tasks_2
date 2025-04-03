// https://www.codewars.com/kata/538835ae443aae6e03000547/train/java

import java.util.function.IntUnaryOperator;

public class Kata {

  public static IntUnaryOperator add(int n) {
    return x -> x + n;
  }
}
