import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        String str = br.readLine();
	        int cnt = 0;
	        int index = 0;
	        
	        while ((index = str.indexOf("WOW", index)) != -1) {
                cnt++;
                index += 1;
            }
	        
	        sb.append(cnt).append("\n");
	    }
	    
	    System.out.println(sb);
	    
	    br.close();
	}
}