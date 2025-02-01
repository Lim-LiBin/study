import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] time = new int[n];
        int result = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(time);

        for (int i = 0; i < n; i++) {
            sum += time[i];
            result += sum;
        }

        bw.write(result + "\n");

        br.close();
        bw.close();
    }
}