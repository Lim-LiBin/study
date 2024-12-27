import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] board = new boolean[101][101];
        int answer = 0;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            for(int k = y; k < y+10; k++) {
                for(int j = x; j < x + 10; j++){
                    if(!board[k][j]) {
                        board[k][j] = true;
                        answer++;
                    }
                }
            }
        }
        
        System.out.println(answer);
    }
}
