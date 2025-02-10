import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	        arr[i] = Integer.parseInt(br.readLine());
	    }
	    
	    int cnt0 = 0, cnt1 = 0;
	    
	    for (int num : arr) {
	        if (num == 0) cnt0++;
	        else cnt1++;
	    }
	    
	    System.out.println(Math.max(cnt0, cnt1) == cnt0 ? "Junhee is not cute!" : "Junhee is cute!");
	    
	    br.close();
	}
}