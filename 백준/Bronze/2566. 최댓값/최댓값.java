import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[9][9];
        int max = 0;
        int maxN = 0;
        int maxM = 0;

        for(int i = 0; i < 9; i++) {
            String[] strArr = br.readLine().split(" ");
            for(int j = 0; j < 9; j++) {
                board[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] >= max) {
                    max = board[i][j];
                    maxN = i + 1;
                    maxM = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxN + " " + maxM);
    }
}
