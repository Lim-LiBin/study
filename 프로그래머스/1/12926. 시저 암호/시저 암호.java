class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                sb.append(' ');
                continue;
            }
            
            if (Character.isLowerCase(ch)) {
                sb.append((char)((ch - 'a' + n) % 26 + 'a'));
            } else if ((Character.isUpperCase(ch))) {
                sb.append((char)((ch - 'A' + n) % 26 + 'A'));
            }
        }
        
        return sb.toString();
    }
}