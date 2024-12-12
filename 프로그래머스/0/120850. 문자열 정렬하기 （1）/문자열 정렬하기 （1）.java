import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int cnt = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i))) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        int index = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer[index++] = my_string.charAt(i) - '0';
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}