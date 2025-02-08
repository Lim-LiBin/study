import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int[] arr = new int[3];
	    
	    for (int i = 0; i < 3; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    Arrays.sort(arr);
	    
	    for (int n : arr) {
	        sb.append(n).append(" ");
	    }
	    
	    System.out.println(sb.toString());
	    
	    br.close();
	}
}