import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] strArr = br.readLine().split(" ");
	    int sum = 56 * Integer.parseInt(strArr[0]) + 24 * Integer.parseInt(strArr[1]) + 14 * Integer.parseInt(strArr[2]) + 6 * Integer.parseInt(strArr[3]);
	    
	    System.out.println(sum);
	    
	    br.close();
	}
}