package solution;

// 숫자의 합 구하기
class Solution2 {
    public long solution(int n, int num) {
        String nums = String.valueOf(num);
        char [] arr =  nums.toCharArray();
        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer += arr[i] - '0';
        }

        return answer;

    }
}