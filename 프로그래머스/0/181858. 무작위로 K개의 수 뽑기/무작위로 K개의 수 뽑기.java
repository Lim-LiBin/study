import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i : arr) {
            if(!list.contains(i)) {
                list.add(i);
            }
        }
        
        if (list.size() < k) {
            while (list.size() < k)
                list.add(-1);
        }
        
        int[] answer = new int[k];
        
        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}