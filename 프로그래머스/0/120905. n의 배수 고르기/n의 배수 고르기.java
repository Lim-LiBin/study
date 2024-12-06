import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> tempList = new ArrayList<>();
        
        for (int num : numlist) {
            if(num % n == 0){
                tempList.add(num);
            }
        }
        
        int[] answer = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}