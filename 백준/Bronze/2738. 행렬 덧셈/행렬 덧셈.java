import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mn = br.readLine().split(" ");
        int n = Integer.parseInt(mn[0]);
        int m = Integer.parseInt(mn[1]);

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m];

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            for(int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            for(int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
