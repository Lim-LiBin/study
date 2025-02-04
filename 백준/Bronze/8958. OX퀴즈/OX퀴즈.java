import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            int score = 0;
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 'O') {
                    sum++;
                    score += sum;
                } else {
                    sum = 0;
                }
            }

            sb.append(score).append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}