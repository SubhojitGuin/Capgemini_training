package stacks;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        ValidParenthesis parenthesis = new ValidParenthesis();

        String string = "[{()}]"; //valid (true)
        String string1 = "[{(}]"; //invalid (false)
        String string2 = "[{()}]([])"; //valid (true)
        String string3 = "[";

        System.out.println(parenthesis.validParenthesis(string));
        System.out.println(parenthesis.validParenthesis(string1));
        System.out.println(parenthesis.validParenthesis(string2));
        System.out.println(parenthesis.validParenthesis(string3));
    }

    public boolean validParenthesis(String str) {
        char[] chArray = str.toCharArray();
        int top = -1;

        for (char c: chArray) {
            if (c == '(' || c == '{' || c == '[') {
                chArray[++top] = c;
            } else {
                if (top == -1) return false;

                if (c == ')' &&  chArray[top] == '(' || c == '}' &&  chArray[top] == '{' || c == ']' &&  chArray[top] == '[') {
                    top--;
                } else {
                    return false;
                }
            }
        }

        return top == -1;
    }

    public boolean validParenthesisStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch: str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (top == '(' && ch != ')' ||
                        top == '{' && ch != '}' ||
                        top == '[' && ch != ']')
                    return false;
            }
        }

        return stack.isEmpty();

    }

}
