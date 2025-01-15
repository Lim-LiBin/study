class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        char[] charArray = s.toCharArray();
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(charArray[i]));
        }
        
        if (x % sum != 0) answer = false;
        
        return answer;
    }
}