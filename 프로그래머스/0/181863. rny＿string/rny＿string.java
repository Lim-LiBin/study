class Solution {
    public String solution(String rny_string) {
        String answer = "";
        
        for (char ch : rny_string.toCharArray()) {
            if (ch == 'm') answer += "rn";
            else answer += ch;
        }
        
        return answer;
    }
}