import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String[] strArr = new String[8];
	    int[] score = {10, 8, 6, 5, 4, 3, 2, 1, 0};
	    
	    for (int i = 0; i < 8; i++) {
	        strArr[i] = br.readLine();
	    }
	    
	    Arrays.sort(strArr);
	    int redScore = 0, blueScore = 0;
	    
	    for (int i = 0, th = 0; i < 8; i++, th++) {
	        String[] str = strArr[i].split(" ");
	        String team = str[1];
	        
	        if (team.equals("R")) redScore += score[th];
	        else blueScore += score[th];
	    }
	    
	    System.out.println(Math.max(redScore, blueScore) == redScore ? "Red" : "Blue");
	    
	    br.close();
	}
}