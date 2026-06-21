package solution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//가장큰수 - 정렬
public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int [][] arr = new int[n+1][n+1];
        int [][] board = new int[n+1][n+1];
        int [][] ques = new int[q][4];

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i<q; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<4; j++){
                ques[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                board[i][j] = arr[i][j] + board[i][j-1] + board[i-1][j] - board[i-1][j-1];
            }
        }


        for (int i = 0; i < q; i++) {
            int x1 = ques[i][0];
            int y1 = ques[i][1];
            int x2 = ques[i][2];
            int y2 = ques[i][3];

            System.out.println(board[x2][y2] - board[x2][y1-1] - board[x2][y1-1] + board[x1-1][y1-1]);
        }

    }
}
