package assignments.assignment2;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {
        ReversePolishNotation obj = new ReversePolishNotation();

        String postfixExpr = "4 6 + 2 / 10 +";
        String postfixExpr1 = "4 6 -";
        int result = obj.evaluateRPN(postfixExpr.split(" "));
        System.out.println(result);

        result = obj.evaluateRPN(postfixExpr1.split(" "));
        System.out.println(result);
    }

    private int evaluateRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token: tokens) {
            try {
                int value = Integer.parseInt(token);
                st.push(value);
            } catch (Exception e) {
                int result = operate(st.pop(), st.pop(), token);
                st.push(result);
            }
        }

        return st.pop();
    }

    private int operate(int val1, int val2, String operator) {
        return switch (operator) {
            case "+" -> val2 + val1;
            case "-" -> val2 - val1;
            case "*" -> val2 * val1;
            case "/" -> val2 / val1;
            case "%" -> val2 % val1;
            default -> 0;
        };
    }

}
