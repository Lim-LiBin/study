class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        int k = 0;
        for(int n : arr) {
            if(n >= 50 && n % 2 == 0) answer[k++] = n / 2;
            else if(n < 50 && n % 2 != 0) answer[k++] = n * 2;
            else answer[k++] = n;
        }
        
        return answer;
    }
}