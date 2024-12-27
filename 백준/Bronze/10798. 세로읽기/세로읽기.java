import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[5][15];

        for(int i=0; i < 5; i++) {
            String line = br.readLine();
            for(int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        StringBuilder answer = new StringBuilder();
        for(int j = 0; j < 15; j++) {
            for(int i = 0; i < 5; i++) {
                if(board[i][j] != '\0') {
                    answer.append(board[i][j]);
                }
            }
        }

        System.out.println(answer.toString());
    }
}
