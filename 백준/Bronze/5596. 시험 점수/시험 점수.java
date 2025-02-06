import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] str1 = br.readLine().split(" ");
	    String[] str2 = br.readLine().split(" ");
	    int sum1 = 0;
	    int sum2 = 0;
	    
	    for (int i = 0; i < 4; i++) {
	        sum1 += Integer.parseInt(str1[i]);
	        sum2 += Integer.parseInt(str2[i]);
	    }
	    
	    System.out.println(Math.max(sum1, sum2));
	    
	    br.close();
	}
}