import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        
        int powerOfTwo = 1;
        while (powerOfTwo < length) {
            powerOfTwo *= 2;
        }
        
        int[] answer = new int[powerOfTwo];
        System.arraycopy(arr, 0, answer, 0, length);
        
        return answer;
    }
}