class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        String[] array = s.split(" ", -1);
        
        for (int i = 0; i < array.length; i++) {
            StringBuilder wordBuilder = new StringBuilder();
            
            for (int j = 0; j < array[i].length(); j++) {
                char ch = array[i].charAt(j);
                
                if (j % 2 == 0) wordBuilder.append(Character.toUpperCase(ch));
                else wordBuilder.append(Character.toLowerCase(ch));
            }
            
            sb.append(wordBuilder);
            if (i < array.length - 1) sb.append(" ");
        }
        
        return sb.toString();
    }
}