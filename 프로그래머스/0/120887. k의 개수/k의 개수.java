class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String res = String.valueOf(k);
        
        for(int l = i; l <= j; l++) {
            String num = String.valueOf(l);
            
            if(num.contains(res)) {
                String[] arr = num.split("");
                
                for(String alpha : arr) {
                    if(alpha.equals(res)) answer++;
                }
            }
        }
        
        return answer;
    }
}