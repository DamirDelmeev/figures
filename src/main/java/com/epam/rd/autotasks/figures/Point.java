package com.epam.rd.autotasks.figures;

import java.util.Comparator;

class Point implements Comparator<Point> {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public int compare(Point o1, Point o2) {
        return Double.compare(o1.getX(), o2.getX());
    }
}
