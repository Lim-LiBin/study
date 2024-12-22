class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int finalB = b / GCD(a, b);
        
        while (finalB != 1) {
            if(finalB % 2 == 0) {
                finalB /= 2;
            } else if(finalB % 5 == 0) {
                finalB /= 5;
            } else{
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
    
    int GCD(int num1, int num2) {
        if(num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
}