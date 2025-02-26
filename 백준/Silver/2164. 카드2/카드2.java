import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size() != 1) {
            q.remove();
            q.add(q.peek());
            q.remove();
        }

        System.out.println(q.remove());

        br.close();
    }
}