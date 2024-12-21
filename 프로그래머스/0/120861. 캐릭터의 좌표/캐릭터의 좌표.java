class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        for(String key : keyinput) {
            if(key.equals("left")) {
                answer[0] -= 1;
                if(answer[0] < -(board[0] / 2))
                    answer[0] = -(board[0] / 2);
            }
            else if(key.equals("right")) {
                answer[0] += 1;
                if(answer[0] > board[0] / 2) {
                    answer[0] = board[0] / 2;
                }
            }
            else if(key.equals("up")) {
                answer[1] += 1;
                if(answer[1] > board[1] / 2) {
                    answer[1] = board[1] / 2;
                }
            }
            else {
                answer[1] -= 1;
                if(answer[1] < -(board[1] / 2)) {
                    answer[1] = -(board[1]/2);
                }
            }
        }
        
        return answer;
    }
}