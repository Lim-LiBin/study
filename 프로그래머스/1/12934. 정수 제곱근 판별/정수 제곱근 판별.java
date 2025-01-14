class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double x = Math.sqrt(n);
        
        if (x == (long)x) {
            answer = ((long)x + 1) * ((long)x + 1);
        }
        
        return answer;
    }
}