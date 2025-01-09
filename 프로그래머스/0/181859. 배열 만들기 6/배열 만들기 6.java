import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.size() != 0 && stk.get(stk.size() - 1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else {
                stk.add(arr[i]);
                i++;
            }
        }
        
        int[] answer = new int[stk.size()];
        
        if (answer.length == 0) answer = new int[]{-1};
        else {
            for (int j = 0; j < answer.length; j++) {
                answer[j] = stk.get(j);
            }
        }
        
        return answer;
    }
}