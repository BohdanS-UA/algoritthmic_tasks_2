// https://www.codewars.com/kata/5fc7d2d2682ff3000e1a3fbc/train/java

public class Kata {
  
  public static boolean isAValidMessage(String message) {
       if (message.isEmpty()) return true;
       if (!Character.isDigit(message.charAt(0))) return false;


        boolean numberPart = true;
        int number = 0;
        int indexStart = 0;
        int indexFinish = 0;
        String substring;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (numberPart) {
                if (!Character.isDigit(c)) {
                    indexFinish = i;
                    numberPart = false;
                    number = Integer.parseInt(message.substring(indexStart, indexFinish));
                    indexStart = i;
                }
            } else {
                if (Character.isDigit(c)) {
                    indexFinish = i;
                    numberPart = true;
                    substring = message.substring(indexStart, indexFinish);
                    if (number != substring.length()) {
                        return false;
                    }
                    indexStart = i;
                }
                if (i == message.length() - 1) {
                    substring = message.substring(indexStart);
                    if (number != substring.length()) {
                        return false;
                    }
                }
            }
        }
        return true;
  }
}
