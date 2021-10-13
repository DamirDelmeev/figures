package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    Point a;
    Point b;
    Point c;
    Point d;
    Line firstLine;
    Line secondLine;
    Line thirdLine;
    Line fourthLine;
    Line diagonal;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        firstLine = new Line(a, b);
        secondLine = new Line(b, c);
        thirdLine = new Line(c, d);
        fourthLine = new Line(d, a);
        diagonal = new Line(a, c);
    }

    @Override
    public double area() {
        double semiPerimeter1 = (firstLine.length() + secondLine.length() + diagonal.length()) / 2;
        double semiPerimeter2 = (thirdLine.length() + fourthLine.length() + diagonal.length()) / 2;
        return Math.sqrt(semiPerimeter1 * (semiPerimeter1 - firstLine.length())
                * (semiPerimeter1 - secondLine.length()) * (semiPerimeter1 - diagonal.length()))
                + Math.sqrt(semiPerimeter2 * (semiPerimeter2 - thirdLine.length())
                * (semiPerimeter2 - fourthLine.length()) * (semiPerimeter2 - diagonal.length()));
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")" + "(" + b.getX() + "," + b.getY() + ")"
                + "(" + c.getX() + "," + c.getY() + ")" + "(" + d.getX() + "," + d.getY() + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min = Math.min(Math.min(Math.min(a.getX(), b.getX()), c.getX()), d.getX());
        if (a.getX() == min) {
            return a;
        } else if (b.getX() == min) {
            return b;
        } else if (c.getX() == min) {
            return c;

        } else if (d.getX() == min) {
            return d;
        } else {
            return null;
        }
    }

}
