package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//boj 1253 투포인터 '좋은 수 구하기'
public class Solution9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start_node = 0;
        int end_node = 0;
        int count = 0;
        int index = 1;

        while (index < n) {
            start_node = 0;
            end_node = index-1;

            while(start_node < end_node) {
                if (arr[start_node] + arr[end_node] < arr[index]) {
                    start_node++;
                    continue;
                }

                if (arr[start_node] + arr[end_node] > arr[index]) {
                    end_node--;
                    continue;
                }


                if (arr[start_node] + arr[end_node] == arr[index]) {
                    count++;
                    break;
                }
            }
            index++;
        }

        System.out.println(count);
    }
}

