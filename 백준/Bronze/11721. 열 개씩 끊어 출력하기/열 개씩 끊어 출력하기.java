import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        int i = 0;
        while (i < arr.length) {
            for (int j = 0; j < 10 && i < arr.length; j++) {
                sb.append(arr[i++]);
            }
            sb.append('\n');
        }

        System.out.println(sb);

        br.close();
    }
}