package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2차원 구간합 문제 구현
public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int ques = Integer.parseInt(st.nextToken());
        int [] answer = new int[ques];

        int [][] q = new int[ques][4];
        int [][] arr = new int[size+1][size+1];
        int [][] sum =  new int[size+1][size+1];

        for(int i  = 1; i <= size; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= size; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < ques; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                q[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 구간합 배열 할당
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + arr[i][j];
            }
        }

//        // 구간합 배열 검사
//        for (int i = 1; i <= size; i++) {
//            System.out.println();
//            for (int j = 1; j <= size; j++) {
//                System.out.print(sum[i][j]);
//                System.out.println(" ");
//            }
//        }

        for (int i = 0; i < ques; i++) {
            int x1 = q[i][0];
            int y1 = q[i][1];
            int x2 = q[i][2];
            int y2 = q[i][3];

            System.out.println(sum[x2][y2] - sum[x2][y1-1] - sum[x1-1][y2] + sum[x1-1][y1-1]);
        }
    }
}
