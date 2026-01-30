package assignments.assignment2;

import java.util.Stack;

/*
Reverse a string using Stack
 */
public class ReverseString {

    public static void main(String[] args) {
        ReverseString obj = new ReverseString();

        String s = "abcd";
        String rev = obj.reverse(s);
        System.out.println(rev);
    }

    private String reverse(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch: s.toCharArray()) {
            st.push(ch);
        }

        StringBuilder rev = new StringBuilder();
        while (!st.isEmpty()) {
            rev.append(st.pop());
        }

        return rev.toString();
    }

}
