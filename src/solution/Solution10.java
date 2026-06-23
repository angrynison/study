package solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution10 {
    static char[] password;
    static int[] rules;
    static int[] rules_check;

    static int cases;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());
        int partition_length = Integer.parseInt(st.nextToken());

        int cases = 0;
        password = new char[length+1];
        rules = new int[4];
        rules_check = new int[4];
        password = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            rules[i] = Integer.parseInt(st.nextToken());
        }

        int start_node = length-partition_length;

        for (int i = partition_length; i <= length; i++) {
            if (i == partition_length) {
                for (int j = start_node; j <= i; j++) {
                    ADD(password[j]);
                }
            }
            else {
                REMOVE(password[start_node]);
                ADD(password[i]);
                start_node++;
            }
        }

        int result = cases*(cases-1)/4;
        System.out.println(result);



    }

    private static void ADD(char c){
        switch(c){
            case 'A':
                rules_check[0]++;
                if (rules[0] == rules_check[0]) {
                    cases++;
                }
                break;

            case 'C':
                rules_check[1]++;
                if(rules_check[1] == rules_check[1]) {
                    cases++;
                }
                break;

            case 'G':
                rules_check[2]++;
                if(rules_check[2] == rules_check[2]) {
                    cases++;
                }
                break;

            case 'T':
                rules_check[3]++;
                if(rules_check[3] == rules_check[3]) {
                    cases++;
                }
                break;
        }
    }

    private static void REMOVE(char c){
        switch(c){
            case 'A':
                rules_check[0]--;
                break;

            case 'C':
                rules_check[1]--;
                break;

            case 'G':
                rules_check[2]--;
                break;

            case 'T':
                rules_check[3]--;
                break;
        }
    }
}
