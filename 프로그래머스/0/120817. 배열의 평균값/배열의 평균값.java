class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int n = numbers.length;
        int num = 0;
        
        for(int number : numbers) {
            num += number;
        }
        
        answer = num / (double)n;
        
        return answer;
    }
}