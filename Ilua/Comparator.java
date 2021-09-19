package Ilua;

//Здесь у тебя была лишняя переменная нахер не нужная
public class Comparator {//тут вот инкапсуляцию я сделал чтобы слишком много public методов не было в классах
    public static void comparison(Earth earth, Sun sun){//параметры поменял для инкапсуляции ,надо как можно больше прятать от пользователя
        Console.print("The ratio of the volume of the sun to the volume of the earth - " + sun.getSun()/earth.getEarth());
    }
}
