package assignments.assignment2;

import java.util.Stack;

/*
Check whether a string is a Palindrome using Stack
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        CheckPalindrome obj = new CheckPalindrome();

        String s = "abba";
        if (obj.isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private boolean isPalindrome(String s) {
        return s.equals(reverse(s));
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
