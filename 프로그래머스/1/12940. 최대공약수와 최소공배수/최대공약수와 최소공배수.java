class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {GCD(n, m), LCM(n, m)};
        return answer;
    }
    
    int GCD(int num1, int num2) {
        if (num2 == 0) return num1;
        return GCD(num2, num1 % num2);
    }
    
    int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }
}