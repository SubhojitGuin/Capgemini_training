package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharacters {

    public static void main(String[] args) {
        UniqueCharacters obj = new UniqueCharacters();

        String s = "abcdbf";
        System.out.println(obj.getUniqueCharaters(s));
    }

    private List<Character> getUniqueCharaters(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch: s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        List<Character> characters = new ArrayList<>();
        for (char ch: freqMap.keySet()) {
            if (freqMap.get(ch) == 1) characters.add(ch);
        }

        return characters;
    }

}
