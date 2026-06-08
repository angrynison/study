package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간합
public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] sum = new int[n+1];
        int [] sum1 = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            sum[i] = sum[i-1]+Integer.parseInt(st.nextToken());
        }

        int [][] que = new int[q][2];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            que[i][0] = Integer.parseInt(st.nextToken());
            que[i][1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < q; i++) {
            int end = que[i][1];
            int start = que[i][0];
            System.out.println(sum[end] - sum[start]);
        }
    }

}
