package solution;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

// 코딩복습파일
public class Practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;

        for (int index = 2; index < n; index++){
            int start_node = 0;
            int end_node = index-1;
            while (start_node < end_node){
                if (arr[start_node] + arr[end_node] == arr[index]){
                    count++;
                    start_node++;
                    end_node--;
                    break;
                }

                if (arr[start_node] + arr[end_node] < arr[index]){
                    start_node++;
                    continue;
                }

                if (arr[start_node] + arr[end_node] > arr[index]){
                    end_node--;
                    continue;
                }
            }

        }
        System.out.println(count);
    }
}
