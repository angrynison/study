package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_두개뽑아서더하기 {
    public static void main(String[] args) {

        class Solution {
            public int[] solution(int[] numbers) {

                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        check(numbers[i] + numbers[j], list);
                    }
                }

                int[] answer = new int[list.size()];

                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }

                Arrays.sort(answer);

                return answer;
            }

            Boolean check(int num, ArrayList<Integer> list) {
                if (list.contains(num)) {
                    return false;
                }
                list.add(num);
                return true;
            }


        }

    }
}
