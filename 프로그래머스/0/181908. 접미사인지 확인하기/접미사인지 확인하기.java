class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] str = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            str[i] = my_string.substring(i, my_string.length());
        }
        
        for(int i = 0; i < str.length; i++) {
            if(is_suffix.equals(str[i])) answer = 1;
        }
        
        return answer;
    }
}