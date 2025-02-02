import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) sb.append(Character.toLowerCase(arr[i]));
            else sb.append(Character.toUpperCase(arr[i]));
        }

        System.out.println(sb);

        br.close();
    }
}