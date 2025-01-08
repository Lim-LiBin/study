import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] arr = new int[3];
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) h.put(rank[i], i);
        }
        
        List<Integer> sortedRank = new ArrayList<>(h.keySet());
        Collections.sort(sortedRank);
        
        for (int i = 0; i < 3; i++) {
            arr[i] = h.get(sortedRank.get(i));
        }
        
        answer = arr[0] * 10000 + arr[1] * 100 + arr[2];
        
        return answer;
    }
}