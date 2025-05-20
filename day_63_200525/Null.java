// https://www.codewars.com/kata/5dd73cd4cf95d3000194617d/train/java

public class Null {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj instanceof Null) {
            return true;
        }
        return false;
    }
}
