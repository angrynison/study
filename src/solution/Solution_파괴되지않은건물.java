package solution;

public class Solution_파괴되지않은건물 {
    class Solution {
        public int solution(int[][] board, int[][] skill) {

            int n = board.length;
            int m = board[0].length;
            int [][] skill_sum = new int[n+1][m+1];

            int x1,y1,x2,y2,degree;
            int answer = 0;

            for (int i = 0; i < skill.length; i++) {
                x1 = skill[i][1];
                y1 = skill[i][2];
                x2 = skill[i][3];
                y2 = skill[i][4];
                degree = 0;
                if(skill[i][0] == 1) {
                    degree = -skill[i][5];
                } else if (skill[i][0] == 2) {
                    degree = skill[i][5];
                }
                skill_sum[x1][y1] += degree;
                skill_sum[x1][y2+1] -= degree;
                skill_sum[x2+1][y1] -= degree;
                skill_sum[x2+1][y2+1] += degree;
            }

            for (int i = 0; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    skill_sum[i][j] = skill_sum[i][j] + skill_sum[i][j-1];
                }
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= m; j++) {
                    skill_sum[i][j] = skill_sum[i][j] + skill_sum[i-1][j];
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] + skill_sum[i][j] > 0){
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
