package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 나머지 합 구하기(수학)
/*
s(x) % m = 0, s(y) % m = 0 -->( s(x) - s(y) ) % m = 0 --> s(x) = s(y) 인것을 찾으면됨
 */
public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int val;
        int [] sum =  new int[n];
        int [] fin = new int[10];
        int answer = 0;


        for (int i = 0; i < n; i++) {
            if(i==0) {
                sum[0] = Integer.parseInt(st.nextToken());
                continue;
            }
            sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
        }

        // 연속된 인덱스의 검사가 필요하냐, 특정 값의 갯수가 중요하냐에 따라 배열의 인덱스를 값으로 설정할 수 있음
        for (int i = 0; i < n; i++) {
            val = sum[i] % m;
            if(val == 0) answer++;
            fin[val]++;
        }

        // 나머지는 무조건 나누는 수의 갯수보다 작음 nC2 -> n(n-1)/2
        for (int i = 0; i < m; i++) {
            if (fin[i] > 1) {
                answer += ((fin[i])*(fin[i]-1)/2);
            }
        }
        System.out.println(answer);
    }
}
