class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        
        for(int i = 0;i < babbling.length; i++) {
            String word = babbling[i];
            
            word = word.replaceAll("aya", " ")
                .replaceAll("ye", " ")
                .replaceAll("woo", " ")
                .replaceAll("ma", " ")
                .replaceAll(" ", "");
            
            if(word.equals("")) result++;
        }
        
        return result;
    }
}