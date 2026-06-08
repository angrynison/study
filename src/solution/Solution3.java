package solution;

import java.util.Arrays;

// 수학 교환법칙
public class Solution3 {
    public double solution(int n, int [] score) {

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (max < score[i]) max = score[i];
            sum += score[i];
        }

        return sum/max*100/n;

        //수학식 (A/max*100 + B/max*100 + C/max*100) / N 을 교환법칙으로 단순화 한것
    }
}
