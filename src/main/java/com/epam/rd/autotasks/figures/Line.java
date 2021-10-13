package com.epam.rd.autotasks.figures;

public class Line {
    Point start;
    Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        if (start.equals(end) || end == null) {
            throw new RuntimeException();
        }
    }

    double length() {
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

}
