class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int width = 0;
        int heigth = 0;
        int depth = 0;
        
        width = box[0] / n;
        heigth = box[1] / n;
        depth = box[2] / n;
        
        answer = width * heigth * depth;
        
        return answer;
    }
}