package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    Point center;
    double doubleRadius;

    public Circle(Point center, double doubleRadius) {
        this.center = center;
        this.doubleRadius = doubleRadius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(doubleRadius, 2);
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + doubleRadius + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - doubleRadius, center.getY());
    }
}
