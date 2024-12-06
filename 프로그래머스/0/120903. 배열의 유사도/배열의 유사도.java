class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int length = Math.max(s1.length, s2.length);
        
        if(length == s1.length) {
            for(int i = 0; i < s2.length; i++) {
                for(int j = 0; j < s1.length; j++) {
                    if(s2[i].equals(s1[j])) answer++;
                }
            }
        } else {
            for(int i = 0; i < s1.length; i++) {
                for(int j = 0; j < s2.length; j++) {
                    if(s1[i].equals(s2[j])) answer++;
                }
            }
        }
        
        return answer;
    }
}