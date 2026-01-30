package assignments.assignment1;

/*
Write a Java program to perform basic string manipulations:
Find length of the string
Convert to uppercase and lowercase
Extract a substring
 */
public class StringBasics {

    public static void main(String[] args) {
        String s = "Hello Java";

        StringBasics obj = new StringBasics();
        int length = obj.getLength(s);
        System.out.println("Length: " + length);

        String upper = obj.toUpper(s);
        System.out.println("Upper Case: " + upper);

        String lower = obj.toLower(s);
        System.out.println("Lower Case: " + lower);

        int start = 1;
        int end = 5;
        String substr = obj.getSubstr(s, start, end);
        System.out.println("Substring: " + substr);
    }

    private String getSubstr(String s, int start, int end) {
        return s.substring(start, end);
    }

    private String toLower(String s) {
        StringBuilder sCopy = new StringBuilder();

        for (char c: s.toCharArray()) {
            sCopy.append(Character.toLowerCase(c));
        }

        return sCopy.toString();
    }

    private String toUpper(String s) {
        StringBuilder sCopy = new StringBuilder();

        for (char c: s.toCharArray()) {
            sCopy.append(Character.toUpperCase(c));
        }

        return sCopy.toString();
    }

    private int getLength(String s) {
        return s.length();
    }

}
