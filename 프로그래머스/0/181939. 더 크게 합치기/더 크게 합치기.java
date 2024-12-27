class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        
        if(Integer.parseInt(str1 + str2) >= Integer.parseInt(str2 + str1)) answer = Integer.parseInt(str1 + str2);
        else answer = Integer.parseInt(str2 + str1);
        
        return answer;
    }
}