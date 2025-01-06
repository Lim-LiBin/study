class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] before = new int[arr.length];
        int[] after = arr.clone();
        
        while(true) {
            before = after.clone();
            
            for(int i = 0; i < arr.length; i++) {
                int n = before[i];
            
                if(n >= 50 && n % 2 == 0) after[i] = n / 2;
                else if(n < 50 && n % 2 != 0) after[i] = n * 2 + 1;
                else after[i] = n;
            }
            
            if(java.util.Arrays.equals(before, after)) break;
            answer++;
        }
        
        return answer;
    }
}