import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 1; i <= n; i++) {
	        for (int j = n; j > i; j--) {
	            sb.append(" ");
	        }
	        for (int j = 0; j < 2*i-1; j++) {
	            sb.append("*");
	        }
	        sb.append("\n");
	    }
	    
	    System.out.print(sb);
	    
	    br.close();
	}
}