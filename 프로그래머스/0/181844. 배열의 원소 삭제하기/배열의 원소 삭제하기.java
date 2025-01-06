import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> deleteSet = new HashSet<>();
        
        for (int num : delete_list) {
            deleteSet.add(num);
        }
        
        for (int num : arr) {
            if (!deleteSet.contains(num))
                list.add(num);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}