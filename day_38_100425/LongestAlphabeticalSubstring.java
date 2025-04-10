// https://www.codewars.com/kata/5a7f58c00025e917f30000f1/train/java

class StringHandling {
  public static String longestAlpabeticalSubstring(String text) {
        char[] charArray = text.toCharArray();
        int maxLength = 1;
        int index = 0;
        int counter = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] >= charArray[i - 1]) {
                counter++;
                if (counter > maxLength) {
                    maxLength = counter;
                    index = i - counter + 1;
                }
            } else {
                counter = 1;
            }
        }
        return text.substring(index, index + maxLength);
  }
}
