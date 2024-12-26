import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])) sb.append(Character.toLowerCase(arr[i]));
            else sb.append(Character.toUpperCase(arr[i]));
        }
        
        String str = sb.toString();
        
        System.out.println(str);
    }
}