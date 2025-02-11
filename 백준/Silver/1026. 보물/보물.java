import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    String[] aStr = br.readLine().split(" ");
	    String[] bStr = br.readLine().split(" ");
	    int[] a = new int[n];
	    int[] b = new int[n];
	    int[] b1 = new int[n];
	    int sum = 0;
	    
	    for (int i = 0; i < n; i++) {
	        a[i] = Integer.parseInt(aStr[i]);
	        b[i] = Integer.parseInt(bStr[i]);
	    }
	    
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    for (int i = 0; i < n; i++) {
	        b1[i] = b[n - 1 - i];
	    }
	    
	    for (int i = 0; i < n; i++) {
	        sum += a[i] * b1[i];
	    }
	    
	    System.out.println(sum);
	}
}