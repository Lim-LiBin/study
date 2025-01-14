import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        String str = "";
        int[] array = new int[s.length()];
        int[] list = new int[s.length()];
        
        int i = 0;
        for (char ch : s.toCharArray()) {
            array[i++] = Integer.parseInt(String.valueOf(ch));
        }
        
        Arrays.sort(array);
        
        for (int l = 0; l < array.length; l++) {
            list[l] = array[array.length - 1 - l];
        }
        
        for (int num : list) {
            str += String.valueOf(num);
        }
        
        answer = Long.parseLong(str);
        
        return answer;
    }
}