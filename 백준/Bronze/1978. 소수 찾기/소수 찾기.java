import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);

            if (isPrime(num)) cnt++;
        }

        System.out.println(cnt);

        br.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}