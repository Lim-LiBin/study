class Solution {
    public String solution(int age) {
        String age_str = String.valueOf(age);
        
        char[] array = age_str.toCharArray();
        String answer = "";
        
        for(char c : array) {
            answer += (char)((c - '0') + 97);
        }
        
        return answer;
    }
}