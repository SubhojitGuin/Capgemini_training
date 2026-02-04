package assignments.assignment5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IndexOfFirstRepeatingElement {

    public int getIndex(String string) {
//        Map<Character, Integer> indexMap = new HashMap<>();
//
//        for (int i = 0; i < string.length(); i++) {
//            char ch = string.charAt(i);
//
//            if (indexMap.containsKey(ch)) {
//                return indexMap.get(ch);
//            } else {
//                indexMap.put(ch, i);
//            }
//        }

        char global = '\u0000';

        Set<Character> charSet = new HashSet<>();
        for (char ch: string.toCharArray()) {
            if (charSet.contains(ch)) {
                global = ch;
                break;
            } else {
                charSet.add(ch);
            }
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == global) return i;
        }

        return -1;
    }

    public char getChar(String string) {
        Map<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (indexMap.containsKey(ch)) {
                return ch;
            } else {
                indexMap.put(ch, i);
            }
        }

//        Set<Character> charSet = new HashSet<>();
//        for (char ch: string.toCharArray()) {
//            if (charSet.contains(ch)) {
//                return ch;
//            } else {
//                charSet.add(ch);
//            }
//        }

        return '\u0000';
    }

    public static void main(String[] args) {
        String content = "abdjcklbjckla";

        IndexOfFirstRepeatingElement obj = new IndexOfFirstRepeatingElement();
        System.out.println("Repeating index: " + obj.getIndex(content));
        System.out.println("Repeating character: " + obj.getChar(content));
    }

}
