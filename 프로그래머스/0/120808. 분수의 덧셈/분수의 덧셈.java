class Solution {
    static int gcd(int a, int b){
        int minNum = Math.min(a, b);
        int n = 0;
        
        for(int i = minNum; i >= 1; i--) {
            if((a % i == 0) && (b % i ==0)){
                n = i;
                break;
            }
        }
        
        return n;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 0;
        int denom = 0;
        int gcdValue = 0;
        
        numer = numer1 * denom2 + numer2 * denom1;
        denom = denom1 * denom2;
        
        gcdValue = gcd(numer, denom);
            
        answer[0] = numer / gcdValue;
        answer[1] = denom / gcdValue;
        
        return answer;
    }
}