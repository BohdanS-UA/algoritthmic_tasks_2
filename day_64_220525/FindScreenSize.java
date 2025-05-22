// https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f/train/java

class Kata {
    public static String findScreenHeight(int width, String ratio) {
    	  String[] widthHigh = ratio.split(":");
        int high = width * Integer.parseInt(widthHigh[1]) / Integer.parseInt(widthHigh[0]);
        return width + "x" + high;
    }
}
