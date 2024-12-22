package String;

import java.util.*;

public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> ans = new HashMap<>();
        for (String s : strs) {
            char[] ch = s.toLowerCase().toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] input = { "Eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result = groupAnagrams(input);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
