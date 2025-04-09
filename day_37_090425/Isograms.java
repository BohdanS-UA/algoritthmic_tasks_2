// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

public class isogram {
    public static boolean  isIsogram(String str) {
        if (str == null || str.length() == 0) return true;
        int[] arr = new int[26];
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
            int index = lowerCase.charAt(i) - 'a';
            if (arr[index] == 0) {
                arr[index] = 1;
            } else {
                return false;
            }
        }
        return true;
    } 
}
