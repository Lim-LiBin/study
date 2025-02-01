import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break;

            String str1 = new StringBuilder(str).reverse().toString();
            if (str.equals(str1)) result.append("yes\n");
            else result.append("no\n");
        }

        System.out.println(result);

        br.close();
    }
}