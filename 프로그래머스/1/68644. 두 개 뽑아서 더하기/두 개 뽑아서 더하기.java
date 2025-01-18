import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> h = new HashSet<Integer>();
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                h.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[h.size()];
        int k = 0;
        for (int num : h) {
            answer[k++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}