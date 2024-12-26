// https://www.codewars.com/kata/56833b76371e86f8b6000015/train/java

public class CentParser {
  public static Integer toCents(String price) {
        String pattern = "\\$\\d+\\.\\d{2}";
        if (!price.matches(pattern)) {
            return null;
        }
    
        int dotIndex = price.indexOf('.');
        int cents = Integer.parseInt(price.substring(1, dotIndex)) * 100;
        cents += Integer.parseInt(price.substring(dotIndex + 1));
        return cents;
  } 
}
