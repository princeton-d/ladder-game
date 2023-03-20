package org.ladderGame.domain.ladder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladder {

    private final List<Line> lines;

    private Ladder(List<Line> lines) {
        this.lines = Collections.unmodifiableList(lines);
    }

    public static Ladder create(int width, int height) {
        List<Line> lines = new ArrayList<>();
        for (int row = 0; row < height; row++) {
            lines.add(Line.draw(width));
        }
        return new Ladder(lines);
    }

    public int walk(int col) {
        int row = 0;
        while (row != lines.size()) {
            col = lines.get(row).walk(col);
            row++;
        }
        return col;
    }
}