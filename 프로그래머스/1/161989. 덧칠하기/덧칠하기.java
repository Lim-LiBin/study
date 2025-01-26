class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPainted = -1;
        
        for (int s : section) {
            if (s > lastPainted) {
                lastPainted = s + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}