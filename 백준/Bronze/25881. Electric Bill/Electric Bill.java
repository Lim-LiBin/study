import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    String[] strArr = br.readLine().split(" ");
	    int underRate = Integer.parseInt(strArr[0]);
	    int additionalRate = Integer.parseInt(strArr[1]);
	    int n = Integer.parseInt(br.readLine());
	    int bill = 0;
	    
	    for (int i = 0; i < n; i++) {
	        int usage = Integer.parseInt(br.readLine());
	        
	        if (usage <= 1000) {
	            bill = usage * underRate;
	        } else {
	            int additional = usage - 1000;
	            
	            bill = 1000 * underRate + additional * additionalRate;
	        }
	        
	        sb.append(usage).append(" ").append(bill).append("\n");
	    }
	    
	    System.out.println(sb);
	    
	    br.close();
	}
}