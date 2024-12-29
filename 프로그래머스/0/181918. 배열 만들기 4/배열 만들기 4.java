import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if(list.isEmpty()) {
                list.add(arr[i]);
                i += 1;
            } else {
                if(list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i += 1;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] stk = list.stream().mapToInt(Integer::intValue).toArray();
        
        return stk;
    }
}