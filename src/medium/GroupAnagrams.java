package medium;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<>());
            }

            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
