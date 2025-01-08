class Solution {
    public String[] solution(String[] picture, int k) {
        int originalHeight = picture.length;
        int originalWidth = picture[0].length();
        
        String[] answer = new String[originalHeight * k];
        
        for (int i = 0; i < originalHeight; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int l = 0; l < k; l++) {
                for (int j = 0; j < originalWidth; j++) {
                    for (int m = 0; m < k; m++) {
                        sb.append(picture[i].charAt(j));
                    }
                }
                answer[i * k + l] = sb.toString();
                sb.setLength(0);
            }
        }
        
        return answer;
    }
}
