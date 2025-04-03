// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

class Solution {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        switch (length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s likes this", names[0]);
            case 2:
                return String.format("%s and %s like this", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %s others like this", names[0], names[1], names.length - 2);
        }
    }
}
