class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        
        if (x1 == true && x2 == true) {
            if (x3 == true && x4 == true) {
                answer = true;
            } else if (x3 == false && x4 == false) {
                answer = false;
            } else {
                answer = true;
            }
        } else if (x1 == false && x2 == false) {
            if (x3 == true && x4 == true) answer = false;
            else if (x3 == false && x4 == false) answer = false;
            else answer = false;
        } else {
            if (x3 == true && x4 == true) answer = true;
            else if (x3 == false && x4 == false) answer = false;
            else answer = true;
        }
        
        return answer;
    }
}