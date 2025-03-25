// https://www.codewars.com/kata/593b1909e68ff627c9000186/train/java

class Generator {
      public static String nickname (String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        String vowels = "aeiou";
        char c = name.charAt(2);
        int index = vowels.contains(String.valueOf(c)) ? 4 : 3;
        return name.substring(0, index);
      }
}
