import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        LinkedHashSet<Character> h = new LinkedHashSet<Character>();
        
        for(char ch : my_string.toCharArray()) {
            h.add(ch);
        }
        
        for(char ch : h){
            answer += ch;
        }
        
        return answer;
    }
}