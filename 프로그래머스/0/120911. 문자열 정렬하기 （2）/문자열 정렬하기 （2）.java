import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
        
        char[] list = my_string.toCharArray();
        
        Arrays.sort(list);
        
        for(int i = 0; i < list.length; i++) {
            answer += list[i];
        }
        
        return answer;
    }
}