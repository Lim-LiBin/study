class Solution {
    public String solution(int n) {
        String answer = "";
        String evenS = "수";
        String oddS = "박";
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) answer += evenS;
            else answer += oddS;
        }
        
        return answer;
    }
}