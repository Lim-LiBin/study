class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[(intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1)];
        
        int k = 0;
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer[k] = arr[i];
            k++;
        }
        
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++ ){
            answer[k] = arr[i];
            k++;
        }
        
        return answer;
    }
}