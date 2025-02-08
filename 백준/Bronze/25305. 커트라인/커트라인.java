import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int result = 0;
	    
	    int n = Integer.parseInt(st.nextToken());
	    int k = Integer.parseInt(st.nextToken());
	    int[] arr = new int[n];
	    st = new StringTokenizer(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	    }
	    
	    Arrays.sort(arr);
	    
	    for (int i = n - 1; i >= n - k; i--) {
	        result = arr[i];
	    }
	    
	    System.out.println(result);
	    
	    br.close();
	}
}