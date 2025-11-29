import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                bfs(i, n, computers, visited);
            }
        }
        
        return answer;
    }
    
    public void bfs(int start, int n, int[][] computers, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()) {
            int now = q.poll();
            
            for (int i = 0; i < n; i++) {
                if (computers[now][i] == 1 && !visited[i]) {
                visited[i] = true;
                q.add(i);
                }
            }
        }
    }
}