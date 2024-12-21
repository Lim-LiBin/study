import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arr = before.toCharArray();
        char[] arr1 = after.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        if(Arrays.equals(arr, arr1)) answer = 1;
        else answer = 0;
        
        return answer;
    }
}