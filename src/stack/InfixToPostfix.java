package stack;

import java.util.Stack;

public class InfixToPostfix {
    public static int prec(char c) {
       if (c == '^') {
           return 3;
       } else if (c == '/' || c == '*') {
           return 2;
       } else if (c == '+' || c == '-') {
           return 1;
       } else {
           return -1;
       }
    }

    public static StringBuilder infixToPostFix(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
               st.push(c);
            } else if (c == ')') {
               while (!st.isEmpty() && st.peek() != '(') {
                   result.append(st.pop());
               }
               if (!st.isEmpty()) {
                   st.pop();
               }
            } else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result;
    }
    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        StringBuilder stringBuilderResult = InfixToPostfix.infixToPostFix(exp);
        System.out.println("postFix Expression :" + stringBuilderResult);
    }
}
