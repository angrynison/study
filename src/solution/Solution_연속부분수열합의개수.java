package solution;
import java.util.HashSet;

public class Solution_연속부분수열합의개수 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int[] elements) {

                int n = elements.length;
                // +1 은 s[0] 아무것도 더하지 않는 경우를 포함
                int [] sum = new int[2*n+1];
                sum[0] = 0;
                // 1. sum 배열 채우기
                for (int i = 1; i < sum.length; i++) {
                    int val = (i-1)%elements.length;
                    sum[i] = sum[i-1]+elements[val];
                }

                // 2. 구간합 HashSet에 추가하기
                HashSet<Integer> answer = new HashSet<>();
                for(int i = 0; i < elements.length; i++){
                    for(int len = 1; len <= elements.length; len++){
                        answer.add(sum[i+len]-sum[i]);
                    }
                }




                return answer.size();
            }
        }
    }
}
