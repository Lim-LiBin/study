class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String evenS = "수";
        String oddS = "박";
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append(evenS);
            else sb.append(oddS);
        }
        
        return sb.toString();
    }
}