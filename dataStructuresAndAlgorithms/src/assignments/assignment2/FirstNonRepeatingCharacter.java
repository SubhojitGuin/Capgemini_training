package assignments.assignment2;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();

        char[] charArray = {'a', 'b', 'b', 'c', 'a', 'c', 'd'};
        String[] firstNonRepeatingChar = obj.getFirstNRChar(charArray);

        for (String ch: firstNonRepeatingChar) {
            System.out.print(ch + " ");
        }
    }

    private String[] getFirstNRChar(char[] charArray) {
        String[] NRChar = new String[charArray.length];

        Queue<Character> queue = new ArrayDeque<>();
        int[] count = new  int[26];

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (++count[ch - 'a'] == 1) {
                queue.offer(ch);
            }

            while (!queue.isEmpty() && count[queue.peek() - 'a'] != 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                NRChar[i] = "-1";
            } else {
                NRChar[i] = Character.toString(queue.peek());
            }
        }

        return NRChar;
    }

}
