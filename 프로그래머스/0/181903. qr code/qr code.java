class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for(int i = 0; i < code.length(); i++) {
            int div = i % q;
            
            if(div == r) answer += code.charAt(i);
        }
        
        return answer;
    }
}