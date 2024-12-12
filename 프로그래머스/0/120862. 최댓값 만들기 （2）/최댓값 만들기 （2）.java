import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int option1 = numbers[0] * numbers[1];
        int option2 = numbers[numbers.length - 2] * numbers[numbers.length - 1];
        
        answer = Math.max(option1, option2);
        
        return answer;
    }
}