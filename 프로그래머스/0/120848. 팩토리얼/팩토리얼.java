class Solution {
    public int solution(int n) {
        int answer = 0;
        int maxN = 0;
        int fac[] = new int[10];
        
        for(int i = 0; i <= 9; i++) {
            fac[i] = factorial(i+1);
        }
        
        for(int i = 0; i <= 9; i++) {
            if(fac[i] > maxN && fac[i] <= n) {
                maxN = fac[i];
                answer = i + 1;
            }
        }
        
        return answer;
    }
    
    public static int factorial(int n) {
        if(n == 1) return 1;
        
        return n * factorial(n-1);
    }
}