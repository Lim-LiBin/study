import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");
        String[] arr = new String[str.length];

        Arrays.sort(str);

        for(int i = 0; i < str.length; i++) {
            arr[i] = str[str.length - 1 -i];
        }

        for(String s : arr) {
            System.out.print(s);
        }
    }
}
