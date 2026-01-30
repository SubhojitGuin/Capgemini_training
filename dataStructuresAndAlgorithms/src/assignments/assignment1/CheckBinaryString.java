package assignments.assignment1;

/*
Write a program to check whether a given string is a binary string (contains only 0 and 1).
 */
public class CheckBinaryString {

    public static void main(String[] args) {
        String s = "101101010100";

        CheckBinaryString obj = new CheckBinaryString();
        if (obj.isBinaryString(s)) {
            System.out.println("The string is a binary string");
        } else {
            System.out.println("The string is a binary string");
        }
    }

    public boolean isBinaryString(String s) {
        for (char c: s.toCharArray()) {
            if (c != '0' || c != '1')
                return false;
        }
        return true;
    }
}
