import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    Set<Integer> set = new HashSet<>();
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    while (st.hasMoreTokens()) {
	        set.add(Integer.parseInt(st.nextToken()));
	    }
	    
	    int m = Integer.parseInt(br.readLine());
	    st = new StringTokenizer(br.readLine());
	    
	    while (st.hasMoreTokens()) {
	        int num = Integer.parseInt(st.nextToken());
	        sb.append(set.contains(num) ? 1 : 0).append(" ");
	    }
	    
	    System.out.println(sb.toString());
	    
	    br.close();
	}
}