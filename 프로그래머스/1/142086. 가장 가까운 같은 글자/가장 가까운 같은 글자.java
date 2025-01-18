import java.util.*;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();
        char[] array = s.toCharArray();
        int[] answer = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if (!h.containsKey(ch)) {
                h.put(ch, i);
                answer[i] = -1;
            } else {
                int value = h.get(ch);
                int d = i - value;
                
                h.put(ch, i);
                answer[i] = d;
            }
        }
        
        return answer;
    }
}