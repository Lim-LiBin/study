class Solution {
    static int[] deverse(int[] array){
        int[] arr = new int[array.length];
        
        for(int i=0;i<arr.length; i++) {
            arr[i] = array[arr.length - 1 - i];
        }
        
        return arr;
    }
    public int[] solution(int[] num_list) {
        int[] answer = deverse(num_list);
        
        return answer;
    }
}