import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int[] arr = new int[5];
	    int[] score = new int[5];
	    int sum = 0;
	    
	    for (int i = 0; i < 5; i++) {
	        arr[i] = Integer.parseInt(br.readLine());
	        
	        if (arr[i] >= 40) score[i] = arr[i];
	        else score[i] = 40;
	    }
	    
	    for (int n : score) {
	        sum += n;
	    }
	    
	    System.out.println(sum / 5);
	}
}