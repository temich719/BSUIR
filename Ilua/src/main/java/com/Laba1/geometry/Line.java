package com.Laba1.geometry;

public class Line {

    private final Point start; //начальная точка прямой
    private final Point end; //конечная точка прямой

    //создать прямую (Line) по двум точкам
    public Line(final Point start, final Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    //создать прямую (Line) из двух пар координат
    public Line(double xStart, double yStart, double xEnd, double yEnd) {
        start = new Point(xStart, yStart); //создать начальную точку
        end = new Point(xEnd, yEnd); //создать конечную точку
    }

    //вычислить длину прямой
    public double length() {
        return start.distance(end); //использовать метод из класса Point
    }

    //вернуть точку как пересечение двух прямых(P.S. в задании вроде бы не надо, но на всякий с методы взял, если че уберете)
    public Point intersects(final Line line1) {
        Point localPoint = new Point(0, 0);
        double num =
                (this.end.getY() - this.start.getY())*(this.start.getX() - line1.start.getX()) -

                        (this.end.getX() - this.start.getX())*(this.start.getY() - line1.start.getY());

        double denom =
                (this.end.getY() - this.start.getY())*(line1.end.getX() - line1.start.getX()) -

                        (this.end.getX() - this.start.getX())*(line1.end.getY() - line1.start.getY());

        localPoint.setX(line1.start.getX() + (line1.end.getX() - line1.start.getX())*num/denom);
        localPoint.setY(line1.start.getY() + (line1.end.getY() - line1.start.getY())*num/denom);
        return localPoint;
    }

    //преобразовать прямую (Line) в строку
    @Override//эта строка по факту ничего не делает ,это просто метка для программиста что мы переопределили метод
    //toString который определен в классе Object(все классы Java наследуются от класса Object поэтому можно переопределять его
    // методы)
    public String toString() {
        return "(" + start.toString() + "):(" + end.toString() + ")";
    }
}
