package algorithm;

import java.lang.Comparable;
import java.util.Comparator;

public class Score {

    int english;
    int math;

    public Score(int english, int math) {
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return "english score : " + english + " " + "math score : " + math;
    }

}
