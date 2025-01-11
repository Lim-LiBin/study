import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (String str : strArr) {
            int length = str.length();
            
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        int answer = 0;
        for (int value : map.values()) {
            answer = Math.max(answer, value);
        }
        
        return answer;
    }
}