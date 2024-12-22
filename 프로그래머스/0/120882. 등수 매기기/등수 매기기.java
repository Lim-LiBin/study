class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[answer.length];
        
        for(int i = 0; i < answer.length; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        for(int i = 0; i <answer.length; i++) {
            answer[i] = 1;
            
            for(int j = 0; j < answer.length; j++) {
                if(avg[i] < avg[j]) answer[i]++;
            }
        }
        
        return answer;
    }
}