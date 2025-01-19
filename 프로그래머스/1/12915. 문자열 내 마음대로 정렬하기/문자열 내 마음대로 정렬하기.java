import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings.clone();
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length - 1; j++) {
                char charA = answer[j].charAt(n);
                char charB = answer[j + 1].charAt(n);
                
                if (charA > charB || (charA == charB && answer[j].compareTo(answer[j + 1]) > 0)) {
                    String temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        
        return answer;
    }
}