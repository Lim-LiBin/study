class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            if(calc(quiz[i])) {
                answer[i] = "O";
            } else answer[i] = "X";
        }
        
        return answer;
    }
    
    boolean calc(String str) {
        String[] arr = str.split(" ");
        
        if(arr[1].equals("+")) {
            if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) return true;
            else return false;
        }
        else {
            if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) return true;
            else return false;
        }
    }
}