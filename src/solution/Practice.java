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

        int start_node = 1;
        int end_node = 1;
        int count = 1;
        int[] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }

        int sum = arr[1];

        while(end_node < n){

            if(sum < n){
                end_node++;
                sum += arr[end_node];
                continue;
            }

            if(sum > n) {
                sum -= arr[start_node];
                start_node++;
                continue;
            }

            if(sum == n){
                count++;
                end_node++;
                sum += arr[end_node];
                continue;
            }
        }

        System.out.println(count);

    }
}
