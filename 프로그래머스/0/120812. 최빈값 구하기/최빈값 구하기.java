import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = -1;
        
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        
        for(int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        boolean isDuplicate = false;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxFrequency) {
                maxFrequency = value;
                answer = key;
                isDuplicate = false;
            } else if (value == maxFrequency) {
                isDuplicate = true;
                answer = -1;
            }
        }
        
        return answer;
    }
}