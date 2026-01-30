package assignments.assignment1;

/*
Write a Java program to search for a pattern in a given string.
 */
public class PatternSearch {

    public static void main(String[] args) {
        String s = "Abcd2314@iem";
        String pattern = "iem";

        int pos = s.indexOf(pattern);
        if (pos != -1) {
            System.out.println("Pattern found at index " + pos);
        } else {
            System.out.println("Pattern not found");
        }
    }

}
