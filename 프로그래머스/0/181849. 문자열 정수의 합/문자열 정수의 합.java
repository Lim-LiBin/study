class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (char ch : num_str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(ch));
        }
        
        return answer;
    }
}