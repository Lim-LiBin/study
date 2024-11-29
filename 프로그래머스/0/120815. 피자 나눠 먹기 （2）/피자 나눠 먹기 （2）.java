class Solution {
    public static int gcd (int a, int b) {
        int minNum = Math.min(a, b);
        int n = 0;
        
        for (int i = minNum; i >= 1; i--) {
            if((a % i == 0) && (b % i == 0)){
                n = i;
                break;
            }
        }
        
        return n;
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
    
    
    public int solution(int n) {
        int mutiple = lcm(6, n);
        int answer = mutiple / 6;
        
        return answer;
    }
}