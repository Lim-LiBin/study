class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase();
        int cnt_p = 0, cnt_y = 0;
        
        for (char str : s.toCharArray()) {
            if (str == 'p') cnt_p++;
            else if (str == 'y') cnt_y++;
        }
        
        if (cnt_p != cnt_y) answer = false;

        return answer;
    }
}