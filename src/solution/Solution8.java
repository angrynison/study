package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// boj1940 투 포인터 두 수를 활용
public class Solution8 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int target =  Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        int start_node = 0;
        int end_node = n-1;

        while (start_node < end_node){

            if (arr[start_node] + arr[end_node] < target){
                start_node++;
                continue;
            }

            if (arr[start_node] + arr[end_node] > target){
                end_node--;
                continue;
            }

            if (arr[start_node] + arr[end_node] == target){
                count++;
                start_node++;
                end_node--;
                continue;
            }
        }


        System.out.println(count);

    }
}
