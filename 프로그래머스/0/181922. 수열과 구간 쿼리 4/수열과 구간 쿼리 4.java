class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        answer = arr.clone();
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for (int j = 0; j < answer.length; j++){
                if(j >= s && j <= e && j % k == 0) {
                    answer[j] += 1;
                }
            }
        }
        
        return answer;
    }
}