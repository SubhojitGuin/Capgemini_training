package assignments.assignment1;

/*
Write a Java program to check whether a given string is a palindrome.
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        String s = "wow";

        CheckPalindrome obj = new CheckPalindrome();
        if (obj.isPalindrome(s)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        char[] c = s.toCharArray();

        while (i < j) {
            if (c[i] != c[j]) return false;
            i++;
            j--;
        }

        return false;
    }

}
