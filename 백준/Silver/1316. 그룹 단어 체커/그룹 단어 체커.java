import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(check(sc.next()) == true) cnt++;
        }

        System.out.println(cnt);
    }

    public static boolean check(String str) {
        boolean check[] = new boolean[26];
        int prev = 0;

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if(prev != now) {
                if(check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else continue;
        }

        return true;
    }
}