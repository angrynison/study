package solution;

public class Solution_수열과구간쿼리1 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] arr, int[][] queries) {
                for(int i = 0; i < queries.length; i++){
                    int inx = queries[i][0];
                    for(int j = 0; j < queries[i][1] - queries[i][0] + 1; j++){
                        arr[inx]++;
                        inx++;
                    }
                }
                return arr;
            }
        }
    }
}
