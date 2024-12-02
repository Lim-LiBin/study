class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (char n : my_string.toCharArray()) {
            if(Character.isDigit(n))
                answer += n - '0';
            else continue;
        }
        
        return answer;
    }
}