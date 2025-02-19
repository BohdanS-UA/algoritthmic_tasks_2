// https://www.codewars.com/kata/5cd12646cf44af0020c727dd/train/java

public class SquarePi {
    int digits;
    private static final String PI = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

    public SquarePi(int digits) {
        this.digits = digits;
    }

    public int calculate() {
        String basicString = PI.substring(0, digits);
        int sumOfexponents = 0;
        for (int i = 0; i < basicString.length() ; i++) {
            sumOfexponents += Math.pow(Integer.parseInt(String.valueOf(basicString.charAt(i))), 2);
        }
        return (int) Math.ceil(Math.sqrt(sumOfexponents));
    }
}
