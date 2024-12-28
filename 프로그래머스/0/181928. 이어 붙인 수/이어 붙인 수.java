class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even_str = "";
        String odd_str = "";
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) odd_str += String.valueOf(num_list[i]);
            else even_str += String.valueOf(num_list[i]);
        }
        
        answer = Integer.parseInt(odd_str) + Integer.parseInt(even_str);
        
        return answer;
    }
}