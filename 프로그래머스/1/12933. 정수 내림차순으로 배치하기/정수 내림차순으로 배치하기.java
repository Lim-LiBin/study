import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        char[] array = s.toCharArray();
        
        Arrays.sort(array);
        
        StringBuilder sb = new StringBuilder();
        for (char ch : array) {
            sb.append(ch);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}