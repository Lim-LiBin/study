class Solution {
    public int[] solution(int money) {
        int cup = money / 5500;
        int mon = money % 5500;
        
        int[] answer = {cup, mon};
        
        return answer;
    }
}