class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            word = word.replaceAll("aya", " ")
                       .replaceAll("ye", " ")
                       .replaceAll("woo", " ")
                       .replaceAll("ma", " ")
                       .replaceAll(" ", "");
            
            if(word.equals("")) answer++;
        }
        return answer;
    }
}