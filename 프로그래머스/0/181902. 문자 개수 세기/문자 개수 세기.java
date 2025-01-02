class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (char c : my_string.toCharArray()) {
            if(c >= 'A' && c <= 'Z') {
                answer[c - 'A']++; //0~25
            } else if (c >= 'a' && c <= 'z') {
                answer[c - 'a' + 26]++; //26~
            }
        }
        
        return answer;
    }
}