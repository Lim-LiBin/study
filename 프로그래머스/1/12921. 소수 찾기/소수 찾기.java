class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];
        
        for (int i = 2; i <= n; i++) {
            check[i] = true;
        }
        
        int root = (int)Math.sqrt(n);
        
        for (int i = 2; i <= root; i++) {
            if (check[i] == true) {
                for (int j = i; i * j <= n; j++) {
                    check[i * j] = false;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (check[i]) answer++;
        }
        
        return answer;
    }
}