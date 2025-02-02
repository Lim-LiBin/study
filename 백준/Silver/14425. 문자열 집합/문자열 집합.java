import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int cnt = 0;

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                if (str[j].equals(s)) cnt++;
            }
        }

        System.out.println(cnt);

        br.close();
    }
}