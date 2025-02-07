import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    int[] arr = new int[N + M];
	    String[] strArr = br.readLine().split(" ");
	    
	    for (int i = 0; i < strArr.length; i++) {
	        arr[i] = Integer.parseInt(strArr[i]);
	    }
	    
	    for (int i = 0; i < N; i++) {
	        String[] str = br.readLine().split(" ");
	        
	        for (int k = 0; k < str.length; k++) {
	            int n = Integer.parseInt(str[k]);
	            arr[k] += n;
	            arr[i] -= n;
	        }
	    }
	    
	    for (int num : arr) {
	        sb.append(num).append(" ");
	    }
	    
	    System.out.println(sb);
	    
	    br.close();
	}
}