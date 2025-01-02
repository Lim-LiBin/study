class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int index : indices) {
            if (index >= 0 && index < my_string.length())
                answer.setCharAt(index, '.');
        } 
        
        return answer.toString().replace(".", "");
    }
}