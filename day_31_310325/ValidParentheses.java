// https://www.codewars.com/kata/52774a314c2333f0a7000688/train/java

import java.util.Stack;

public class Solution{
  
  public static boolean validParentheses(String parens)
  {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < parens.length(); i++) {
        if (parens.charAt(i) == '(') {
            stack.push('(');
        } else if (parens.charAt(i) == ')') {
            if (stack.isEmpty()) {
                return false;
            } else {
                stack.pop();
            }
        }
    }
    return stack.isEmpty();
  }
}
