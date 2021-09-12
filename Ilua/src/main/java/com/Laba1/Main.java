package com.Laba1;
import com.Laba1.geometry.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //объект для считывания данных с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество координат: ");
        int n = scanner.nextInt();

        //задаем размер массива координат и заполняем его данными которые введет пользователь
        double[][] coordinates = new double[n][2];
        for (int i = 0;i < n;i++){
            System.out.println((i+1) + "-ая координата:\nВведите x: ");
            coordinates[i][0] = scanner.nextDouble();
            System.out.println("\nВведите y: ");
            coordinates[i][1] = scanner.nextDouble();
        }

        //создаем массив точек и заполняем его объектами Point
        Point[] points = new Point[coordinates.length];

        for(int i = 0; i < coordinates.length; i++)
            points[i] = new Point(coordinates[i][0],coordinates[i][1]);


        //создаем массив линий и заполняем его с помощью пар объектов Point
        Line[] lines = new Line[points.length - 1];
        lines[0] = new Line(points[0], points[1]);//первый объект заполнили не в массиве т.к. так удобнее искать минимальную длину

        //создаем переменную в которой будем хранить минимальную длину линии
        double min = lines[0].length();

        double totalLength = min; //храним сумму всех длин (начальное значение min т.к мы сразу целиком и полностью обработали
        //первый элемент массива Line опять же для удобства поиска минимальной длины)

        //заполняем остальные ячейки массива
        System.out.println("\nLine "+(1)+' ' +lines[0] + " Length is " + lines[0].length());
        for(int i = 1; i < points.length - 1; i++) {
            //создаем объект класса Line(при помощи конструктора)
            lines[i] = new Line(points[i], points[i+1]);

            //добавляем длину i-того элемента к общей длине
            totalLength += lines[i].length();

            //узнаем является ли текущий элемент минимальным
            if (lines[i].length() < min)min = lines[i].length();

            System.out.println("\nLine "+(i+1)+' ' +lines[i] + " Length is " + lines[i].length());
        }

        //выводим общую длину
        System.out.println("\n\nTotal line length = " + totalLength);

        //выводим минимальную длину
        System.out.println("Min line length = " + min);
    }
}

