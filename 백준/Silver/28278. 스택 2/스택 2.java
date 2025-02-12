import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    Stack<Integer> stack = new Stack<>();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int order = Integer.parseInt(st.nextToken());
	        
	        if (order == 1) {
	            int num = Integer.parseInt(st.nextToken());
	            stack.push(num);
	        } else if (order == 2) {
	            sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
	        } else if (order == 3) sb.append(stack.size()).append("\n");
	        else if (order == 4) sb.append(stack.isEmpty() ? 1 : 0).append("\n");
	        else sb.append(stack.isEmpty() ? - 1 : stack.peek()).append("\n");
	    }
	    
	    System.out.println(sb);
	}
}