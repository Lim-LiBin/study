class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long n = Long.parseLong(p);
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long num = Long.parseLong(t.substring(i, i + p.length()));
            
            if (num <= n) answer++;
        }
       
        return answer;
    }
}