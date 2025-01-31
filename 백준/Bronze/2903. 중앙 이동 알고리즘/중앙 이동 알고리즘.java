import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int dotLine = (1 << n) + 1;
        int result = dotLine * dotLine;

        bw.write(result + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
