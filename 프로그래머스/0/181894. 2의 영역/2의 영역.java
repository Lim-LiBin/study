import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int n :  arr) {
            if (n == 2) cnt++;
        }
        
        if(cnt == 0) return new int[]{-1};
        else if(cnt == 1) {
            return new int[]{2};
        } else {
            int firstIdx = -1, lastIdx = -1;
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 2) {
                    if(firstIdx == -1) firstIdx = i;
                    lastIdx = i;
                }
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int i = firstIdx; i <= lastIdx; i++) {
                list.add(arr[i]);
            }
            
            int[] answer = new int[list.size()];
            
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            
            return answer;
        }
        
    }
}