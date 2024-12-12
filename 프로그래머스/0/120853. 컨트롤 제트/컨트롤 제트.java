class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastAdded = 0;
        
        String[] parts = s.split(" ");
        
        for(String part : parts) {
            if(part.equals("Z")) {
                answer -= lastAdded;
            } else {
                int num = Integer.parseInt(part);
                answer += num;
                lastAdded = num;
            }
        }
        
        return answer;
    }
}