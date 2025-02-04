import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int level = 1;
        int range = 1;

        if (n == 1) bw.write("1\n");
        else {
            while (range < n) {
                range += 6 * level;
                level++;
            }
            bw.write(level + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
