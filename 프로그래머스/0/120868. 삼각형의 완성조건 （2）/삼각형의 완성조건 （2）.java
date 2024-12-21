import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        int lowLimit = sides[1] - sides[0];
        int highLimit = sides[0] + sides[1];
        
        answer = highLimit - lowLimit - 1;
        
        return answer;
    }
}