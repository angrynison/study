package solution;

import java.util.Arrays;

//가장큰수 - 정렬
public class Solution1 {
    public String solution(int[] numbers) {
        String [] nums = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums,(s1,s2) -> (s1+s2).compareTo(s2+s1));
        if(nums[0].equals("0"))
        {
            return "0";
        }
        String answer = "";
        for(int i = 0; i < nums.length; i++){
            answer += nums[i];
        }
        return answer;
    }
}
