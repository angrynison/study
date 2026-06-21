package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//자료구조_투포인터 연속된 자연수의 합
public class Solution7 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int [] arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            arr[i] = i;
        }
        int count = 1;
        int start_node = 1;
        int fin_node = 1;
        int sum = 1;

        while(start_node < n &&  fin_node < n) {
            if (sum < n) {
                fin_node++;
                sum += arr[fin_node];
                continue;
            }

            if (sum > n) {
                sum -= arr[start_node];
                start_node++;
                continue;
            }

            if (sum == n) {
                count++;
                fin_node++;
                sum += arr[fin_node];
                continue;
            }
        }

        System.out.println(count);
    }
}
