import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int cnt = 0;
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            int[] list = new int[j - i + 1];
            
            int l = i - 1;
            for (int m = 0; m < list.length; m++) {
                list[m] = array[l++];
            }
            Arrays.sort(list);
            
            answer[cnt++] = list[k - 1];
        }
        
        return answer;
    }
}