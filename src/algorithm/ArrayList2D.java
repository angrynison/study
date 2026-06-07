package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayList2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());

        ArrayList<Edge> [] list = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new ArrayList<Edge>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int s =Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            list[s].add(new Edge(en,v));
        }
    }
}