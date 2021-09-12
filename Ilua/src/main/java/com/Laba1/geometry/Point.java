package com.Laba1.geometry;

public class Point {

    //координаты точки
    private double x;
    private double y;

    //создаем точку по координатам
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //создать точку (Point) из существующего объекта (Point)
    public Point(final Point aPoint) {
        x = aPoint.x;
        y = aPoint.y;
    }

    //переместить точку(вроде как тоже не нужно по условию так что удалите наверн)
    public void move(double xDelta, double yDelta) {
    //значения параметров являются приращениями для текущих координат
        x += xDelta;
        y += yDelta;
    }

    //вычислить расстояние до другой точки
    public double distance(final Point aPoint)  {
        return Math.sqrt((x - aPoint.x)*(x - aPoint.x) + (y - aPoint.y)*(y - aPoint.y) );
    }

    @Override//та же песня что и с методом toString класса Line
    public String toString() { return x + ", " + y; }

    //все что ниже это геттеры и сеттеры то есть методы либо возращающие значения поля класса либо
    //устанавливающие его(в данной проге не нужны но их принято писать обычно в подобных классах)

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

}
