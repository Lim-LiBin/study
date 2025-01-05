class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] before = new int[n];
        int[] after = new int[num_list.length - n];
        
        for(int i = 0, j = 0; i < num_list.length; i++) {
            if(i <= n - 1) before[i] = num_list[i];
            else after[j++] = num_list[i];
        }
        
        int k = 0;
        for(int num : after) {
            answer[k] = num;
            k++;
        }
        for(int num : before) {
            answer[k] = num;
            k++;
        }
        
        return answer;
    }
}