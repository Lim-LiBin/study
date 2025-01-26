class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] stageData = new double[N][2];
        
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            int people = 0;
            for (int stage : stages) {
                if (stage == i) cnt++;
                if (stage >= i) people++;
            }
            double failureRate = (people == 0) ? 0 : (double)cnt/people;
            stageData[i - 1][0] = failureRate;
            stageData[i - 1][1] = i;
        }
        
        for (int i = 0; i < stageData.length; i++) {
            for (int j = i + 1; j < stageData.length; j++) {
                if (stageData[i][0] < stageData[j][0] || (stageData[i][0] == stageData[j][0] && stageData[i][1] > stageData[j][1])) {
                    double[] temp = stageData[i];
                    stageData[i] = stageData[j];
                    stageData[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) stageData[i][1];
        }
        
        return answer;
    }
}