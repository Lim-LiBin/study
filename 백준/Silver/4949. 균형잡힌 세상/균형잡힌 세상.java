import java.util.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    while (true) {
	        String input = br.readLine();
	        if (input.equals(".")) break;
	        
	        if (isBalanced(input)) {
	            sb.append("yes").append("\n");
	        } else {
	            sb.append("no").append("\n");
	        }
	    }
	    
	    System.out.print(sb.toString());
	    
	    br.close();
	}
	
	public static boolean isBalanced(String str) {
	    Stack<Character> stack = new Stack<>();
	    
	    for (char ch : str.toCharArray()) {
	        if (ch == '(' || ch == '[') {
	            stack.push(ch);
	        } else if (ch == ')') {
	            if (stack.isEmpty() || stack.pop() != '(') return false;
	        } else if (ch == ']') {
	            if (stack.isEmpty() || stack.pop() != '[') return false;
	        }
	    }
	    
	    return stack.isEmpty();
	}
}