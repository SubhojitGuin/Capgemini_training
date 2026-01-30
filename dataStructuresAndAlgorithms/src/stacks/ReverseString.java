package stacks;

public class ReverseString {

    public static void main(String[] args) {
        String s = "abcdefg";

        ReverseString obj = new ReverseString();
        String rev = obj.reverse(s);

        System.out.println(rev);
    }

    private String reverse(String s) {
//        return new StringBuilder(s).reverse().toString();

        char[] chArray = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = chArray[left];
            chArray[left++] = chArray[right];
            chArray[right--] = temp;
        }

        return new String(chArray);
    }
}
