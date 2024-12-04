class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 1; j < numbers.length; j++) {
                if(i == j) continue;
                else if(numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j];
            }
        }
        return answer;
    }
}