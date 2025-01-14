class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int[] array = new int[s.length()];
        
        int k = 0;
        for (char ch : s.toCharArray()) {
            array[k++] = Integer.parseInt(String.valueOf(ch));
        }
        
        for (int i = 0; i < array.length; i++) {
            answer[i] = array[array.length - 1 - i];
        }
        
        return answer;
    }
}