package org.ladderGame.domain.ladder;

import org.ladderGame.utils.RandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Line {

    private final List<Boolean> points;

    private Line(List<Boolean> points) {
        this.points = Collections.unmodifiableList(points);
    }

    public static Line draw(int width) {
        List<Boolean> points = new ArrayList<>();
        Boolean prev = Boolean.FALSE;
        for (int col = 0; col < width - 1; col++) {
            Boolean current = avoidOverlapping(prev, RandomUtil.nextBoolean());
            points.add(current);
            prev = current;
        }
        return new Line(points);
    }

    private static Boolean avoidOverlapping(Boolean prev, Boolean current) {
        return !prev && current;
    }

    /*
    a   b   c   d
    |---|   |   |
    t   f   f
     */
    public int walk(int col) {
        if (col < points.size() && Boolean.TRUE.equals(points.get(col))) {
            return col + 1;
        }

        if (col > 0 && Boolean.TRUE.equals(points.get(col - 1))) {
            return col - 1;
        }

        return col;
    }
}