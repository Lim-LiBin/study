class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int l = my_string.length() / m;
        
        char[][] arr = new char[l][m];
        
        int index = 0;
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = my_string.charAt(index++);
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i][c - 1];
        }
        
        return answer;
    }
}