class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        int i = 0;
        for(int n : arr) {
            if (k % 2 == 0) answer[i++] = n + k;
            else answer[i++] = n * k;
        }
        
        return answer;
    }
}