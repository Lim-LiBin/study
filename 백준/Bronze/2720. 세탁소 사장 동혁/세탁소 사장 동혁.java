import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int q = 0, d = 0, n = 0, p = 0;

        for(int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());

            q = m / 25;
            m %= 25;

            d = m / 10;
            m %= 10;

            n = m / 5;
            m %= 5;

            p = m;

            bw.write(q + " " + d + " " + n + " " + p + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
