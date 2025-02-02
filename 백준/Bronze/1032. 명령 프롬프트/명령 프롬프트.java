import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        if (n == 1) System.out.println(br.readLine());
        else {
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }

            if (arr[0].length() == 1) {
                boolean check = true;

                for (int i = 0; i < n - 1; i++) {
                    if (!arr[i].equals(arr[i + 1])) {
                        check = false;
                        break;
                    }
                }

                System.out.println(check ? arr[0] : "?");
            } else {
                for (int i = 0; i < arr[0].length(); i++) {
                    char c = arr[0].charAt(i);
                    boolean check = true;

                    for (int j = 0; j < n; j++) {
                        if (arr[j].charAt(i) != c) {
                            check = false;
                            break;
                        }
                    }

                    sb.append(check ? c : "?");
                }
            }

            System.out.println(sb);
        }

        br.close();
    }
}