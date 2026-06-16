package solution;
import java.util.Arrays;

//가장큰수 - 정렬
public class Practice {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, ( s1, s2) ->
            (s2 + s1).compareTo(s1 + s2));

        if (nums[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (String s : nums) {
            answer += s;
        }

        return answer;
    }
}
