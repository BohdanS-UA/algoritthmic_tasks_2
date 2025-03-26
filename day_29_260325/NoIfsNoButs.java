// https://www.codewars.com/kata/592915cc1fad49252f000006/train/java

public class NoIfsNoButs { 
    public static String noIfsNoButs(int a, int b) {     
        int diff = a - b;
        int sign = (diff >> 31) | (-diff >>> 31);

        switch (sign) {
            case 1:
                return (a + " is greater than " + b);
            case -1:
                return (a + " is smaller than " + b);
            case 0:
                return (a + " is equal to " + b);
            default:
                return "Error";
        }
    }
}
