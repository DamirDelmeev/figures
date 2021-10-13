package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    Point a;
    Point b;
    Point c;
    Line firstLine;
    Line secondLine;
    Line thirdLine;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        firstLine = new Line(a, b);
        secondLine = new Line(b, c);
        thirdLine = new Line(c, a);
        if ((firstLine.length() < secondLine.length() + thirdLine.length()) &
                (secondLine.length() < firstLine.length() + thirdLine.length()) &
                (thirdLine.length() < firstLine.length() + secondLine.length())) {
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public double area() {
        double semiPerimeter = (firstLine.length() + secondLine.length() + thirdLine.length()) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - firstLine.length()) * (semiPerimeter - secondLine.length()) * (semiPerimeter - thirdLine.length()));
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")" + "(" + c.getX() + "," + c.getY() + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min = Math.min(Math.min(a.getX(), b.getX()), c.getX());
        if (a.getX() == min) {
            return a;
        } else if (b.getX() == min) {
            return b;
        } else if (c.getX() == min) {
            return c;
        } else {
            return null;
        }
    }
}
