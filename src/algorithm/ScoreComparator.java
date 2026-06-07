package algorithm;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Score> {
    @Override
    public int compare(Score o1, Score o2) {
        if(o2.english == o1.english){
            return o2.math - o1.math;
        }

        return o2.english - o1.english;
    }
}
