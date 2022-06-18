package challenges.week3.camouflage;

import java.util.HashMap;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothMap = setHashMap(clothes);
        for (int value : clothMap.values()) {
            answer *= (value + 1);
        }
        return --answer;
    }

    public HashMap<String, Integer> setHashMap(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String[] cloth : clothes) {
            String key = cloth[1];
            map.put(key, countItem(map, key));
        }
        return map;
    }

    private int countItem(HashMap<String, Integer> map, String key) {
        return map.containsKey(key) ? map.get(key) + 1 : 1;
    }
}
