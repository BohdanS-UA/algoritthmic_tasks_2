// https://www.codewars.com/kata/54b80308488cb6cd31000161/train/java

import java.util.Stack;

public class Groups{

  public static boolean groupCheck(String s){
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
            char oneChar = s.charAt(i);

            switch (oneChar) {
                case '(':
                case '{':
                case '[':
                    stack.push(oneChar);
                    break;
                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
  }
}
