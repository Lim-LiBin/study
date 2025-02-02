import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[2];

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(",");
            for (int j = 0; j < 2; j++) {
                arr1[j] = Integer.parseInt(arr[j]);
            }

            sb.append(arr1[0] + arr1[1] + "\n");
        }

        System.out.println(sb);

        br.close();
    }
}