class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] check = {false, false, false, false, false, false, false, false, false, false};
        
        for (int i = 0; i < numbers.length; i++) {
            check[numbers[i]] = true;
        }
        
        for (int i = 0; i < check.length; i++) {
            if (!check[i]) answer += i;
        }
        
        return answer;
    }
}