package solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution_파리퇴치
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for (int test_case = 1; test_case <= T; test_case++)
        {
            // 테스트 케이스마다 "n m" 줄을 새로 읽기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // 테스트 케이스마다 배열 새로 만들기
            int[][] board = new int[n + 1][n + 1];
            int[][] sum = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                    sum[i][j] = board[i][j] + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];
                }
            }

            int max = 0;
            // i, j = 파리채 왼쪽 위 / 오른쪽 아래 = (i+m-1, j+m-1)
            for (int i = 1; i <= n - m + 1; i++) {
                for (int j = 1; j <= n - m + 1; j++) {
                    int x2 = i + m - 1;
                    int y2 = j + m - 1;
                    int val = sum[x2][y2] - sum[i - 1][y2] - sum[x2][j - 1] + sum[i - 1][j - 1];
                    if (val > max) {
                        max = val;
                    }
                }
            }

            sb.append('#').append(test_case).append(' ').append(max).append('\n');
        }
        System.out.print(sb);
    }
}