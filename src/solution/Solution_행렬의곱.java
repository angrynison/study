package solution;

import java.io.IOException;

// 프로그래머스
public class Solution_행렬의곱 {
    public static void main(String[] args) throws IOException {
        class Solution {
            public int[][] solution(int[][] arr1, int[][] arr2) {

                // answer 행렬의 크기
                int n = arr1.length;
                int m = arr2[0].length;
                // 더하기 할 배열의 크기
                int lim = arr1[0].length;

                int [][]arr = new int[n][m];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++){
                        int val = 0;
                        while(val < lim) {
                            arr[i][j] += arr1[i][val] * arr2[val][j];
                            val++;
                        }

                    }
                }


                return arr;
            }
        }
    }
}
