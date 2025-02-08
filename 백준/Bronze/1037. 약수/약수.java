import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    
	    int[] arr = new int[t];
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    for (int i = 0; i < t; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    Arrays.sort(arr);
	    
	    System.out.println(arr[0] * arr[t - 1]);
	    
	    br.close();
	}
}