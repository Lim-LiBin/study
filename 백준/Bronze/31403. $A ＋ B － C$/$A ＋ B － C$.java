import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);

        sb.append(a1 + b1- c1).append("\n");
        sb.append(Integer.parseInt((a + b)) - c1).append("\n");

        System.out.println(sb);

        br.close();
    }
}