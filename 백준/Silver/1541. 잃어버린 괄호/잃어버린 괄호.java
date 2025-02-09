import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] str = br.readLine().split("-");
	    
	    int result = sumOfNumbers(str[0]);
	    
	    for (int i = 1; i < str.length; i++) {
	        result -= sumOfNumbers(str[i]);
	    }
	    
	    System.out.println(result);
	    
	    br.close();
	}
	
	private static int sumOfNumbers(String part) {
	    String[] numbers = part.split("\\+");
	    int sum = 0;
	    for (String num : numbers) {
	        sum += Integer.parseInt(num);
	    }
	    return sum;
	}
}