package assignments.assignment5;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "tab", "nat", "bat"};

        GroupAnagrams obj = new GroupAnagrams();
        List<List<String>> lists = obj.groupAnagram(words);
        System.out.println(lists);
    }

    private List<List<String>> groupAnagram(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word: words) {
            char[] chArr = word.toCharArray();
            Arrays.sort(chArr);
            String w = new String(chArr);

            if (map.containsKey(w)) {
                List<String> list = map.get(w);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(w, list);
            }
        }

        return new ArrayList<>(map.values());
    }


}
