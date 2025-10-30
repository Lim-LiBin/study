class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] / 2 >= 1) {
                for (int j = 0; j < food[i]/2; j++) {
                    sb.append(String.valueOf(i));
                }
            }
        }
        
        sb.append("0");
        
        for (int i = food.length - 1; i >= 1; i--) {
            if (food[i] / 2 >= 1) {
                for (int j = 0; j < food[i]/2; j++) {
                    sb.append(String.valueOf(i));
                }
            }
        }
        
        return sb.toString();
    }
}