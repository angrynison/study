package solution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

//가장큰수 - 정렬
public class Practice {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int target =  Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine());
        int []arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start_node = 0;
        int end_node = n-1;
        int count = 0;

        while(start_node < end_node){

            if(arr[start_node] + arr[end_node] < target){
                start_node++;
                continue;
            }

            if(arr[start_node] + arr[end_node] > target){
                end_node--;
                continue;
            }

            if(arr[start_node] + arr[end_node] == target){
                count++;
                start_node++;
                end_node--;
                continue;
            }
        }

        System.out.println(count);
    }
}
