// https://www.codewars.com/kata/58ddffda929dfc2cae0000a5/train/java

public class Dinglemouse {

  public static long[] clonewars(final int kataPerDay) {
        long clones = 1;
        int kataPerDayByOneClone = kataPerDay;
        long solvedKata = clones * kataPerDayByOneClone;
        while (--kataPerDayByOneClone > 0) {
            clones = clones * 2;
            solvedKata += clones * kataPerDayByOneClone;
        }
        return new long[]{clones, solvedKata};
  }
}
