import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        String[] strArr = br.readLine().split(" ");
	        int k = Integer.parseInt(strArr[0]);
	        int num = Integer.parseInt(strArr[1]);
	        int s1 = 0, s2 = 0, s3 = 0;
	        
	        for (int j = 1; j <= num; j++) {
	            s1 += j;
	        }
	        
	        int j = 1;
	        int cnt = 0;
	        while (cnt != num) {
	            s2 += j;
	            j += 2;
	            cnt++;
	        }
	        
	        int l = 2;
	        int cnt1 = 0;
	        while (cnt1 != num) {
	            s3 += l;
	            l += 2;
	            cnt1++;
	        }
	        
	        sb.append(k).append(" ").append(s1).append(" ").append(s2).append(" ").append(s3).append("\n");
	    }
	    
	    System.out.println(sb);
	    
	    br.close();
	}
}