class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[200];
        
        for(int[] i : lines) {
            int start = i[0]+100; //[3, 5]일 경우 103번째 인덱스에 저장
            int end = i[1]+100;
            
            for(int k = start; k < end; k++) {
                cnt[k]++;
            }
        }
        
        for(int i : cnt) {
            if(i>1) answer++;
        }
        
        return answer;
    }
}