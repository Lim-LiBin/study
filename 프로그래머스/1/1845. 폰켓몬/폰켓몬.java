import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int avg = nums.length / 2;
        
        HashSet<Integer> poketmon = new HashSet<>();
        for (int num : nums) {
            poketmon.add(num);
        }
        
        answer = Math.min(poketmon.size(), avg);
        
        return answer;
    }
}