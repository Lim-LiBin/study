import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    for (int i = 0; i < n; i++) {
	        String[] strArr = br.readLine().split(" ");
	        int[] arr = new int[10];
	        int a = 0, max = 0;
	        int index = arr.length - 1;
	        
	        for (int j = 0; j < 10; j++) {
	            arr[j] = Integer.parseInt(strArr[j]);
	        }
	        
	        Arrays.sort(arr);
	        
	        while (a < 3) {
	            max = arr[index];
	            a++;
	            index--;
	        }
	        
	        sb.append(max).append("\n");
	    }
	    
	    System.out.println(sb.toString());
	    
	    br.close();
	}
}