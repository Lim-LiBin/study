import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
            set.add(arr[i]);
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr1 = new int[m];
        String[] s1 = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            arr1[i] = Integer.parseInt(s1[i]);

            if (set.contains(arr1[i])) sb.append("1\n");
            else sb.append("0\n");
        }

        System.out.println(sb);

        br.close();
    }
}