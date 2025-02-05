import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int last = -1;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.startsWith("push")) {
                String[] s = str.split(" ");
                last = Integer.parseInt(s[1]);
                q.add(last);
            } else if (str.equals("pop")) {
                if (q.isEmpty()) System.out.println("-1");
                else System.out.println(q.remove());
            } else if (str.equals("size")) System.out.println(q.size());
            else if (str.equals("empty")) System.out.println(q.isEmpty() ? "1" : "0");
            else if (str.equals("front")) System.out.println(q.isEmpty() ? "-1" : q.peek());
            else if (str.equals("back")) System.out.println(q.isEmpty() ? "-1" : last);
        }

        br.close();
    }
}