import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int n = Integer.parseInt(br.readLine());
	    String[] arr = br.readLine().split(" ");
	    
	    int m = Integer.parseInt(br.readLine());
	    String[] arr1 = br.readLine().split(" ");
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for (String s : arr1) {
	        map.put(Integer.parseInt(s), 0);
	    }
	    
	    for (String s : arr) {
	        int num = Integer.parseInt(s);
	        if (map.containsKey(num)) {
	            map.put(num, map.get(num) + 1);
	        }
	    }
	    
	    for (String s : arr1) {
	        sb.append(map.get(Integer.parseInt(s))).append(" ");
	    }
	    
	    System.out.println(sb.toString().trim());
	    
	    br.close();
	}
}